import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;

public class GUIBookMgt {

	protected Shell shell;
	private static BookShelf bookShelf = new BookShelf();
	private List bookList;
	private Label lblBookCount;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUIBookMgt window = new GUIBookMgt();
			window.open();
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
		shell.setSize(610, 500);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		Composite composite = new Composite(shell, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.left = new FormAttachment(0, 10);
		fd_composite.right = new FormAttachment(0, 582);
		fd_composite.top = new FormAttachment(0, 10);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new GridLayout(1, false));
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		fd_composite.bottom = new FormAttachment(composite_1, -6);
		FormData fd_composite_1 = new FormData();
		fd_composite_1.left = new FormAttachment(0, 10);
		fd_composite_1.right = new FormAttachment(100, -10);
		fd_composite_1.bottom = new FormAttachment(100, -10);
		
		Label lblBookCount = new Label(composite, SWT.NONE);
		lblBookCount.setText("\uB0B4\uAC00 \uC18C\uC7A5\uD558\uACE0 \uC788\uB294 \uCC45 \uBAA9\uB85D");
		
		List bookList = new List(composite, SWT.BORDER);
		GridData gd_bookList = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_bookList.widthHint = 554;
		gd_bookList.heightHint = 351;
		bookList.setLayoutData(gd_bookList);
		composite_1.setLayout(new GridLayout(5, false));
		composite_1.setLayoutData(fd_composite_1);
		
		Button btnAddBook = new Button(composite_1, SWT.NONE);
		btnAddBook.setText("Add Book");
		//new Label(composite_1, SWT.NONE);
		btnAddBook.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				insertBookInfo(shell);
			}
		});
		
		Button btnGetAllBooks = new Button(composite_1, SWT.NONE);
		btnGetAllBooks.setText("Get All Books");
		//new Label(composite_1, SWT.NONE);
		btnGetAllBooks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				showAllBookInfo();
			}
		});
		
		Button btnBookDetailInfo = new Button(composite_1, SWT.NONE);
		btnBookDetailInfo.setText("Book Detail Info");
		btnBookDetailInfo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				super.widgetSelected(e);
				updateBookInfo(shell);
			}
		});

	}
	
	public void insertBookInfo(Shell shell) {
		DlgAddBook dlg = new DlgAddBook(shell);
		if(dlg.open() != Dialog.OK) return;
		
		String title = dlg.title;
		String publisher = dlg.publisher;
		String type = dlg.bookType;
		
		String name = dlg.authorName;
		String birthdate = dlg.birthDate;
		String career = dlg.career;
		Gender gender = dlg.gender;
		
		Author author = new Author(name, birthdate, gender, career);
		Book book = new Book(title, publisher, type, author);
		
		bookShelf.addBook(book);
	}
	
	public void showAllBookInfo() {
		String[] bookInfos = bookShelf.getBooks();
		
		lblBookCount.setText(Integer.toString(bookShelf.getBookCount()) + "±Ç");
		
		bookList.removeAll();
		for(String s : bookInfos){
			System.out.println(s);
		}
		
	}
	
	public void updateBookInfo(Shell shell) {
		int index = bookList.getSelectionIndex();
		Book selectedBook = bookShelf.selectBook(index);
		
		DlgDetailInfo dlg = new DlgDetailInfo(shell);
		
		dlg.title = selectedBook.getTitle();
		dlg.publisher = selectedBook.getPublisher();
		dlg.bookType = selectedBook.getType();
		dlg.authorName = selectedBook.getAuthor().getName();
		dlg.birthDate = selectedBook.getAuthor().getBirthdate();
		dlg.gender = selectedBook.getAuthor().getGender();
		dlg.career = selectedBook.getAuthor().getCareer();
		
		if (dlg.open() != Dialog.OK) return;		
		selectedBook.update(dlg.title, dlg.publisher);

	}
	
	
}
