
import java.util.Scanner;

public class BookMgt {
	private static Scanner scan;
	private static BookShelf bookShelf;

	public static void main(String[] args) {		
		bookShelf = new BookShelf();
		scan = new Scanner(System.in);

		while (true) {
			int menu = showMenu();
			if (menu == 7)
				break;
			
			switch(menu) {
			case 1: insertBookInfo(); break;
			case 2: showAllBookInfo(); break;
			case 3: selectBookInfo(); break;
			case 4: updateBookInfo(); break;
			case 5: removeBookFromBookShelf(); break;
			case 6: clearBookShelf(); break;
			}
			
			System.out.println();
		}

		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}

	public static int showMenu() {
		System.out.println("========================================================");
		System.out.println("1.å �߰� 2.��� å �˻� 3.å �˻� 4.å ���� 5.å ���� 6.��� å ���� 7.����");
		System.out.println("========================================================");
		int menu = -1;

		System.out.print("�޴��� �����ϼ��� >> ");
		menu = Integer.parseInt(scan.nextLine());

		System.out.println();
		return menu;
	}
	
	public static void insertBookInfo() {
		System.out.println("å�� ������ �Է��ϼ���.(����, ���ǻ�, å���� ������ �Է�)");
		System.out.print("���� >> ");
		String title = scan.nextLine();
		System.out.print("���ǻ� >> ");
		String publisher = scan.nextLine();
		System.out.print("å���� >> ");
		String type = scan.nextLine();
		
		System.out.println();
		System.out.println("���� ������ �Է��ϼ���.(�̸�, �������, ����(��:1, ��:2), ��� ������ �Է�)");
		System.out.print("�̸� >> ");
		String name = scan.nextLine();
		System.out.print("������� >> ");
		String birthdate = scan.nextLine();
		System.out.print("���� >> ");
		int g = Integer.parseInt(scan.nextLine());
		System.out.print("��� >> ");
		String career = scan.nextLine();
		
		Gender gender = Gender.UNKNOWN;
		if(g == 1) gender = Gender.MAN;
		else if(g == 2) gender = Gender.WOMAN;
		
		Author author = new Author(name, birthdate, gender, career);
		Book book = new Book(title, publisher, type, author);
		
		bookShelf.addBook(book);
	}
	
	public static void showAllBookInfo() {
		String[] bookInfos = bookShelf.getBooks();
		
		String deco = new String(new char[60]).replace("\0", "=");
		System.out.println(deco);
		System.out.println(String.format("�� %d���� å�� �ֽ��ϴ�.", bookShelf.getBookCount()));
		System.out.println(deco);
		
		for(String s : bookInfos){
			System.out.println(s);
		}
	}
	
	public static void selectBookInfo() {
		System.out.print("�˻��� å�� ������ �Է��ϼ��� >> ");
		String title = scan.nextLine();
		
		Book selectedBook = bookShelf.selectBook(title);
		if(selectedBook == null){
			System.out.println("�˻��� å�� �����ϴ�.");
			return;
		}
		
		System.out.println(selectedBook.printDetatil());		
	}

	public static void updateBookInfo() {
		System.out.print("������ å�� ������ �Է��ϼ��� >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if(selectedBook == null){
			System.out.println("������ å�� �����ϴ�.");
			return;
		}
		
		System.out.print("�� ������ �Է��ϼ��� >> ");
		String newtitle = scan.nextLine();
		
		System.out.print("���ǻ絵 �����Ͻðڽ��ϱ�?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();
		
		if(confirm.equals("y")){
			System.out.print("�� ���ǻ縦 �Է��ϼ��� >> ");
			String newpublisher = scan.nextLine();
			
			selectedBook.update(newtitle, newpublisher);
		}
		else{
			selectedBook.update(newtitle);
		}
		
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	public static void removeBookFromBookShelf() {
		System.out.print("������ å�� ������ �Է��ϼ��� >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if(selectedBook == null){
			System.out.println("������ å�� �����ϴ�.");
			return;
		}
		
		System.out.println(selectedBook.printDetatil());		
		System.out.print("å�� ���� �����ϼ��ڽ��ϱ�?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();
		
		if(confirm.equals("n")) return;
		
		int msg = bookShelf.deleteBook(title);
		if(msg == 1){
			System.out.println("å�� �����Ͽ����ϴ�.");
		}
	}
	
	public static void clearBookShelf() {
		System.out.print("å�� ��� �����ϼ��ڽ��ϱ�?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();
		
		if(confirm.equals("y")){
			bookShelf.clearBookShelf();
			System.out.println("å�� ��� �����Ͽ����ϴ�.");
		}
	}	
}
