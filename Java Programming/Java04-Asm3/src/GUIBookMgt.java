
/* 1748022 김유진
 * (JAVA프로그래밍및실습 프로그래밍 과제 #3) 책장 관리 프로그램 GUI 
 * */

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JOptionPane;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.List;
import swing2swt.layout.FlowLayout;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridData;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GUIBookMgt {

	protected Shell shell;
	private static BookShelf bookShelf = new BookShelf();
	private List bookList;
	private Label lblBookCount;

	// 파일에 저장된 책의 정보들을 읽어오는 메소드
	public static void readData() {

		// 기존에 저장된 정보가 없다면, 아무 작업도 하지 않는다.
		File file = new File("mybookshelf.dat");
		if (!file.exists())
			return;

		// 정보가 저장된 파일이 존재한다면,다음을 실행한다.
		try {
			// file로부터 자바 프로그램에 data를 객체단위로 읽어오기 위해, 입력 스트림을 생성한다.
			FileInputStream fileis = new FileInputStream(file);
			ObjectInputStream objectis = new ObjectInputStream(fileis);

			// 읽어온 객체를 ArrayList<Book> type으로 캐스팅하여 bookshelf의 books에 저장한다.
			bookShelf.setBooks((ArrayList<Book>) objectis.readObject());
			// 스트림을 닫는다.
			objectis.close();

			// 입출력 예외처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// readData()메소드 종료

	// 프로그램의 정보를 파일로 저장하는 메소드
	public static void writeData() {

		try {
			// 자바프로그램으로부터 data를 출력하기 위해 출력 스트림을 생성한다.
			FileOutputStream fileos = new FileOutputStream("mybookshelf.dat");
			ObjectOutputStream objectos = new ObjectOutputStream(fileos);
			// bookShelf의 books를 저장하여, ArrayList<Book>단위로 data를 저장하도록 한다.
			objectos.writeObject(bookShelf.getBooks());
			// 스트림을 닫는다.
			objectos.close();
			fileos.close();

			// 입출력 예외처리.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// writeData() 메소드 종료

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUIBookMgt window = new GUIBookMgt();
			readData(); // 프로그램이 시작될 때, 이전에 저장한 책장의 정보를 읽어온다.
			window.open();
			writeData(); // 프로그램이 종료될 때, 책장의 정보를 파일에 저장한다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setMinimumSize(new Point(300, 200));
		shell.setSize(600, 500);
		shell.setText("\uB098\uC774\uD654 \uC11C\uC7AC");
		shell.setLayout(new BorderLayout(10, 10));

		Composite composite_label = new Composite(shell, SWT.NONE);
		composite_label.setLayoutData(BorderLayout.NORTH);
		composite_label.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

		Label label = new Label(composite_label, SWT.NONE);
		label.setText("  \uB0B4\uAC00 \uC18C\uC7A5\uD558\uACE0 \uC788\uB294 \uCC45 \uBAA9\uB85D");

		// 저장된 책의 수를 표시하는 label.
		lblBookCount = new Label(composite_label, SWT.NONE);
		lblBookCount.setText("                              "); // 처음 실행했을 때에는 아무런 텍스트도 나타나지 않는다.

		Composite composite_btn = new Composite(shell, SWT.NONE);
		composite_btn.setLayoutData(BorderLayout.SOUTH);
		composite_btn.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));

		// Add Book버튼.
		Button btnAddBook = new Button(composite_btn, SWT.NONE);
		btnAddBook.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				insertBook(shell); // 버튼을 클릭하면 insertBook()메소드를 통해 책을 추가하는 다이얼로그(DlgAddBook)를 실행시킨다.
				showAllBooks(); // 다이얼로그가 종료되면 리스트를 새로 가져와 보여준다.
			}
		});
		btnAddBook.setText("Add Book");

		// Get All Books 버튼.
		Button btnGetAllBooks = new Button(composite_btn, SWT.NONE);
		btnGetAllBooks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showAllBooks(); // 버튼을 클릭하면 책의 정보를 모두 읽어와 리스트에 목록으로 보여준다.
			}
		});
		btnGetAllBooks.setText("Get All Books");

		// Book Detail Info 버튼.
		Button btnBookDetailInfo = new Button(composite_btn, SWT.NONE);
		btnBookDetailInfo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					updateBookInfo(shell); // 버튼을 클릭하면 선택된 책의 책 상세정보(DlgDetailInfo) 다이얼로그를 실행시킨다.
					showAllBooks(); // 수정이 완료되면 리스트를 갱신한다.
				} catch (NullPointerException err) {
					// 리스트에 선택된 책이 없는 경우, 메세지 다이얼로그를 띄운다.
					JOptionPane.showMessageDialog(null, "책 목록에서 상세정보를 볼 책을 선택하세요.", "오류 메세지",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		btnBookDetailInfo.setText("Book Detail Info");

		// Search 버튼.
		Button btnSerch = new Button(composite_btn, SWT.NONE);
		btnSerch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try { // 버튼 클릭 시 다음을 실행한다.
					String title = JOptionPane.showInputDialog("검색할 책의 제목을 입력하세요.");
					int index = bookShelf.selectedBookIndex(title); // 검색한 책의 index를 반환한다.
					bookList.select(index); // 해당하는 index의 책이 bookList(메인화면의 리스트)에서 선택되도록 한다.
					updateBookInfo(shell); // 선택된 책의 DlgDetailDialog를 띄워 보여준다.
					showAllBooks();// 메인화면의 리스트를 갱신한다.
				} catch (NullPointerException err) {
					// 입력한 제목의 책이 목록에 없는 경우, 메세지 다이얼로그를 띄운다.
					JOptionPane.showMessageDialog(null, "검색된 책이 없습니다.", "오류 메세지", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		btnSerch.setText("Serch");

		// Delete 버튼.
		Button btnDelete = new Button(composite_btn, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try { // 버튼 클릭 시 다음을 실행한다.
						// 사용자로부터 삭제할 책의 제목을 입력받을 수 있는 입력다이얼로그를 띄운다.
					String title = JOptionPane.showInputDialog("삭제할 책의 제목을 입력하세요.");
					Book selectedBook = bookShelf.selectBook(title);

					// 삭제할 책의 정보를 출력하는 확인 다이얼로그를 띄운다.
					int result = JOptionPane.showConfirmDialog(null, selectedBook.printDetatil(), "책 삭제",
							JOptionPane.YES_NO_CANCEL_OPTION);
					// 사용자가 "예", "아니오"의 선택 없이 다이얼로그 창을 닫은 경우
					if (result == JOptionPane.CLOSED_OPTION) {
						// 아무 작업도 하지 않는다.
					}
					// 사용자가 "예"를 선택한 경우
					else if (result == JOptionPane.YES_OPTION) {
						// 책장에서 해당하는 책을 삭제한다.
						bookShelf.deleteBook(title);
					}
					// 사용자가 "아니오"를 선택한 경우
					else if (result == JOptionPane.NO_OPTION) {
						// 아무 작업도 하지 않는다.
					}
					showAllBooks();

					// 입력한 제목의 책이 목록에 없는 경우, 메세지 다이얼로그를 띄운다.
				} catch (NullPointerException err) {
					JOptionPane.showMessageDialog(null, "삭제할 책이 없습니다.", "오류 메세지", JOptionPane.ERROR_MESSAGE);
					return;
				}

			}
		});
		btnDelete.setText("Delete");

		// Close 버튼.
		Button btnClose = new Button(composite_btn, SWT.NONE);
		btnClose.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// 버튼을 누르면 책장의 Data를 파일에 저장한 후, 종료한다.
				writeData();
				System.exit(0);
			}
		});
		btnClose.setText("Close");

		bookList = new List(shell, SWT.BORDER);
		bookList.setLayoutData(BorderLayout.CENTER);

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setLayoutData(BorderLayout.WEST);

		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setLayoutData(BorderLayout.EAST);

	}

	// 책 추가를 위한 메소드
	public void insertBook(Shell shell) {
		DlgAddBook dlg = new DlgAddBook(shell);
		if (dlg.open() != Dialog.OK) {
			return;
		}

		// 다이얼로그에서 저장된 정보를 통해 저자 객체와 후 책 객체를 생성한 후, 책장에 책을 추가한다.
		String title = dlg.title;
		String publisher = dlg.publisher;
		String type = dlg.bookType;

		String name = dlg.authorName;
		String birthdate = dlg.birthDate;
		Gender gender = dlg.gender;
		String career = dlg.career;

		Author author = new Author(name, birthdate, gender, career);
		Book book = new Book(title, publisher, type, author);

		bookShelf.addBook(book);
	}

	// 전체 책 검색을 위한 메소드
	public void showAllBooks() {
		// 책장의 책을 문자열의 배열로 읽어와, 메인 화면 리스트에 보여준다.
		String[] bookInfos = bookShelf.getAllBooks();
		lblBookCount.setText(bookShelf.getBookCount() + "권");
		bookList.removeAll();
		for (String s : bookInfos) {
			bookList.add(s);
		}

	}

	// 책 상세정보 검색 및 수정을 위한 메소드
	public void updateBookInfo(Shell shell) {
		// 메인 화면 리스트에서 선택된 책 객체를 찾는다.
		int index = bookList.getSelectionIndex();
		Book selectedBook = bookShelf.selectBook(index);

		// 선택된 책의 DlgDetailInfo 다이얼로그를 실행시킨다.
		DlgDetailInfo dlg = new DlgDetailInfo(shell);

		dlg.title = selectedBook.getTitle();
		dlg.publisher = selectedBook.getPublisher();
		dlg.bookType = selectedBook.getTitle();
		dlg.authorName = selectedBook.getAuthor().getName();
		dlg.birthDate = selectedBook.getAuthor().getBirthdate();
		dlg.gender = selectedBook.getAuthor().getGender();
		dlg.career = selectedBook.getAuthor().getCareer();

		if (dlg.open() != Dialog.OK) {
			return;
		}
		// 다이얼로그가 종료되면, 책 정보를 업데이트 시킨다.
		selectedBook.update(dlg.title, dlg.publisher);

	}

}
