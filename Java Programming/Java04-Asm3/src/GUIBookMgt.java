
/* 1748022 ������
 * (JAVA���α׷��ֹ׽ǽ� ���α׷��� ���� #3) å�� ���� ���α׷� GUI 
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

	// ���Ͽ� ����� å�� �������� �о���� �޼ҵ�
	public static void readData() {

		// ������ ����� ������ ���ٸ�, �ƹ� �۾��� ���� �ʴ´�.
		File file = new File("mybookshelf.dat");
		if (!file.exists())
			return;

		// ������ ����� ������ �����Ѵٸ�,������ �����Ѵ�.
		try {
			// file�κ��� �ڹ� ���α׷��� data�� ��ü������ �о���� ����, �Է� ��Ʈ���� �����Ѵ�.
			FileInputStream fileis = new FileInputStream(file);
			ObjectInputStream objectis = new ObjectInputStream(fileis);

			// �о�� ��ü�� ArrayList<Book> type���� ĳ�����Ͽ� bookshelf�� books�� �����Ѵ�.
			bookShelf.setBooks((ArrayList<Book>) objectis.readObject());
			// ��Ʈ���� �ݴ´�.
			objectis.close();

			// ����� ����ó��
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// readData()�޼ҵ� ����

	// ���α׷��� ������ ���Ϸ� �����ϴ� �޼ҵ�
	public static void writeData() {

		try {
			// �ڹ����α׷����κ��� data�� ����ϱ� ���� ��� ��Ʈ���� �����Ѵ�.
			FileOutputStream fileos = new FileOutputStream("mybookshelf.dat");
			ObjectOutputStream objectos = new ObjectOutputStream(fileos);
			// bookShelf�� books�� �����Ͽ�, ArrayList<Book>������ data�� �����ϵ��� �Ѵ�.
			objectos.writeObject(bookShelf.getBooks());
			// ��Ʈ���� �ݴ´�.
			objectos.close();
			fileos.close();

			// ����� ����ó��.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// writeData() �޼ҵ� ����

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUIBookMgt window = new GUIBookMgt();
			readData(); // ���α׷��� ���۵� ��, ������ ������ å���� ������ �о�´�.
			window.open();
			writeData(); // ���α׷��� ����� ��, å���� ������ ���Ͽ� �����Ѵ�.
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

		// ����� å�� ���� ǥ���ϴ� label.
		lblBookCount = new Label(composite_label, SWT.NONE);
		lblBookCount.setText("                              "); // ó�� �������� ������ �ƹ��� �ؽ�Ʈ�� ��Ÿ���� �ʴ´�.

		Composite composite_btn = new Composite(shell, SWT.NONE);
		composite_btn.setLayoutData(BorderLayout.SOUTH);
		composite_btn.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));

		// Add Book��ư.
		Button btnAddBook = new Button(composite_btn, SWT.NONE);
		btnAddBook.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				insertBook(shell); // ��ư�� Ŭ���ϸ� insertBook()�޼ҵ带 ���� å�� �߰��ϴ� ���̾�α�(DlgAddBook)�� �����Ų��.
				showAllBooks(); // ���̾�αװ� ����Ǹ� ����Ʈ�� ���� ������ �����ش�.
			}
		});
		btnAddBook.setText("Add Book");

		// Get All Books ��ư.
		Button btnGetAllBooks = new Button(composite_btn, SWT.NONE);
		btnGetAllBooks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showAllBooks(); // ��ư�� Ŭ���ϸ� å�� ������ ��� �о�� ����Ʈ�� ������� �����ش�.
			}
		});
		btnGetAllBooks.setText("Get All Books");

		// Book Detail Info ��ư.
		Button btnBookDetailInfo = new Button(composite_btn, SWT.NONE);
		btnBookDetailInfo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					updateBookInfo(shell); // ��ư�� Ŭ���ϸ� ���õ� å�� å ������(DlgDetailInfo) ���̾�α׸� �����Ų��.
					showAllBooks(); // ������ �Ϸ�Ǹ� ����Ʈ�� �����Ѵ�.
				} catch (NullPointerException err) {
					// ����Ʈ�� ���õ� å�� ���� ���, �޼��� ���̾�α׸� ����.
					JOptionPane.showMessageDialog(null, "å ��Ͽ��� �������� �� å�� �����ϼ���.", "���� �޼���",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		btnBookDetailInfo.setText("Book Detail Info");

		// Search ��ư.
		Button btnSerch = new Button(composite_btn, SWT.NONE);
		btnSerch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try { // ��ư Ŭ�� �� ������ �����Ѵ�.
					String title = JOptionPane.showInputDialog("�˻��� å�� ������ �Է��ϼ���.");
					int index = bookShelf.selectedBookIndex(title); // �˻��� å�� index�� ��ȯ�Ѵ�.
					bookList.select(index); // �ش��ϴ� index�� å�� bookList(����ȭ���� ����Ʈ)���� ���õǵ��� �Ѵ�.
					updateBookInfo(shell); // ���õ� å�� DlgDetailDialog�� ��� �����ش�.
					showAllBooks();// ����ȭ���� ����Ʈ�� �����Ѵ�.
				} catch (NullPointerException err) {
					// �Է��� ������ å�� ��Ͽ� ���� ���, �޼��� ���̾�α׸� ����.
					JOptionPane.showMessageDialog(null, "�˻��� å�� �����ϴ�.", "���� �޼���", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		btnSerch.setText("Serch");

		// Delete ��ư.
		Button btnDelete = new Button(composite_btn, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try { // ��ư Ŭ�� �� ������ �����Ѵ�.
						// ����ڷκ��� ������ å�� ������ �Է¹��� �� �ִ� �Է´��̾�α׸� ����.
					String title = JOptionPane.showInputDialog("������ å�� ������ �Է��ϼ���.");
					Book selectedBook = bookShelf.selectBook(title);

					// ������ å�� ������ ����ϴ� Ȯ�� ���̾�α׸� ����.
					int result = JOptionPane.showConfirmDialog(null, selectedBook.printDetatil(), "å ����",
							JOptionPane.YES_NO_CANCEL_OPTION);
					// ����ڰ� "��", "�ƴϿ�"�� ���� ���� ���̾�α� â�� ���� ���
					if (result == JOptionPane.CLOSED_OPTION) {
						// �ƹ� �۾��� ���� �ʴ´�.
					}
					// ����ڰ� "��"�� ������ ���
					else if (result == JOptionPane.YES_OPTION) {
						// å�忡�� �ش��ϴ� å�� �����Ѵ�.
						bookShelf.deleteBook(title);
					}
					// ����ڰ� "�ƴϿ�"�� ������ ���
					else if (result == JOptionPane.NO_OPTION) {
						// �ƹ� �۾��� ���� �ʴ´�.
					}
					showAllBooks();

					// �Է��� ������ å�� ��Ͽ� ���� ���, �޼��� ���̾�α׸� ����.
				} catch (NullPointerException err) {
					JOptionPane.showMessageDialog(null, "������ å�� �����ϴ�.", "���� �޼���", JOptionPane.ERROR_MESSAGE);
					return;
				}

			}
		});
		btnDelete.setText("Delete");

		// Close ��ư.
		Button btnClose = new Button(composite_btn, SWT.NONE);
		btnClose.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// ��ư�� ������ å���� Data�� ���Ͽ� ������ ��, �����Ѵ�.
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

	// å �߰��� ���� �޼ҵ�
	public void insertBook(Shell shell) {
		DlgAddBook dlg = new DlgAddBook(shell);
		if (dlg.open() != Dialog.OK) {
			return;
		}

		// ���̾�α׿��� ����� ������ ���� ���� ��ü�� �� å ��ü�� ������ ��, å�忡 å�� �߰��Ѵ�.
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

	// ��ü å �˻��� ���� �޼ҵ�
	public void showAllBooks() {
		// å���� å�� ���ڿ��� �迭�� �о��, ���� ȭ�� ����Ʈ�� �����ش�.
		String[] bookInfos = bookShelf.getAllBooks();
		lblBookCount.setText(bookShelf.getBookCount() + "��");
		bookList.removeAll();
		for (String s : bookInfos) {
			bookList.add(s);
		}

	}

	// å ������ �˻� �� ������ ���� �޼ҵ�
	public void updateBookInfo(Shell shell) {
		// ���� ȭ�� ����Ʈ���� ���õ� å ��ü�� ã�´�.
		int index = bookList.getSelectionIndex();
		Book selectedBook = bookShelf.selectBook(index);

		// ���õ� å�� DlgDetailInfo ���̾�α׸� �����Ų��.
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
		// ���̾�αװ� ����Ǹ�, å ������ ������Ʈ ��Ų��.
		selectedBook.update(dlg.title, dlg.publisher);

	}

}
