/* 1748022 ������
 * (JAVA���α׷��ֹ׽ǽ� ���α׷��� ���� #2) å�� ���� ���α׷� Ȯ��
 * */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMgt {
	private static Scanner scan;
	private static BookShelf bookShelf;

	public static void main(String[] args) {

		bookShelf = new BookShelf();
		scan = new Scanner(System.in);

		// ���α׷��� ���۵� �� ���Ͽ� ����� å�� ������ �о� �迭�� �����Ѵ�.
		readData();

		while (true) {
			int menu = showMenu();
			if (menu == 7)
				break;

			switch (menu) {
			case 0: // ���� �ƴ� ���ڸ� �Է��� ���, Ȥ�� �޴� ��ȣ ������ �ش����� �ʴ� ���ڸ� �Է��� ���.
				continue; // ����ڿ��� menu�� �ٽ� �Է¹޴´�.
			case 1:
				insertBookInfo();
				break;
			case 2:
				showAllBookInfo();
				break;
			case 3:
				selectBookInfo();
				break;
			case 4:
				updateBookInfo();
				break;
			case 5:
				removeBookFromBookShelf();
				break;
			case 6:
				clearBookShelf();
				break;
			}

			System.out.println();
		}

		System.out.println("���α׷��� �����մϴ�.");

		// ���α׷��� ����� ��, å�� ������ ���Ͽ� �����Ѵ�.
		writeData();
		scan.close();
	}

	public static int showMenu() {
		System.out.println("========================================================");
		System.out.println("1.å �߰� 2.��� å �˻� 3.å �˻� 4.å ���� 5.å ���� 6.��� å ���� 7.����");
		System.out.println("========================================================");
		int menu = -1;

		try {
			System.out.print("�޴��� �����ϼ��� >> ");
			menu = Integer.parseInt(scan.nextLine());
			// �޴� ��ȣ ������ �ش����� �ʴ� ���ڸ� �Է��� ��� ���ܸ� �߻���Ų��.
			if (menu > 7 || menu < 1)
				throw new Exception(); 
		} catch (NumberFormatException e) {
			// ���ڰ� �ƴ� ���ڸ� �Է��� ��� ������ ���� �޼����� ��µ���, 0�� ��ȯ�Ѵ�.
			System.out.println("���� Ÿ������ �Է����ּ���.");
			return 0;
		} catch (Exception e) {
			// �޴� ��ȣ ������ �ش����� �ʴ� ���ڸ� �Է��� ��� ������ ���� �޼����� ��µ���, 0�� ��ȯ�Ѵ�.
			System.out.println("�޴� ��ȣ ������ �ش��ϴ� ���ڸ� �Է����ּ���. ");
			return 0;
		}

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

		int g = 0;
		Gender gender = Gender.UNKNOWN;
		try { // ������ ������ ���� �Է����� ���� ���, ����ó���� ���� ������ UNKNOWN���� �����ǵ��� �ߴ�.
			System.out.print("���� >> ");
			g = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
		}
		System.out.print("��� >> ");
		String career = scan.nextLine();

		if (g == 1)
			gender = Gender.MAN;
		else if (g == 2)
			gender = Gender.WOMAN;

		Author author = new Author(name, birthdate, gender, career);
		Book book = new Book(title, publisher, type, author);

		bookShelf.addBook(book);
	}

	public static void showAllBookInfo() {
		String[] bookInfos = bookShelf.getAllBooks();

		String deco = new String(new char[60]).replace("\0", "=");
		System.out.println(deco);
		System.out.println(String.format("�� %d���� å�� �ֽ��ϴ�.", bookShelf.getBookCount()));
		System.out.println(deco);

		for (String s : bookInfos) {
			System.out.println(s);
		}
	}

	public static void selectBookInfo() {
		System.out.print("�˻��� å�� ������ �Է��ϼ��� >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if (selectedBook == null) {
			System.out.println("�˻��� å�� �����ϴ�.");
			return;
		}

		System.out.println(selectedBook.printDetatil());
	}

	public static void updateBookInfo() {
		System.out.print("������ å�� ������ �Է��ϼ��� >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if (selectedBook == null) {
			System.out.println("������ å�� �����ϴ�.");
			return;
		}

		System.out.print("�� ������ �Է��ϼ��� >> ");
		String newtitle = scan.nextLine();

		System.out.print("���ǻ絵 �����Ͻðڽ��ϱ�?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();

		if (confirm.equals("y")) {
			System.out.print("�� ���ǻ縦 �Է��ϼ��� >> ");
			String newpublisher = scan.nextLine();

			selectedBook.update(newtitle, newpublisher);
		} else {
			selectedBook.update(newtitle);
		}

		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}

	public static void removeBookFromBookShelf() {
		System.out.print("������ å�� ������ �Է��ϼ��� >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if (selectedBook == null) {
			System.out.println("������ å�� �����ϴ�.");
			return;
		}

		System.out.println(selectedBook.printDetatil());
		System.out.print("å�� ���� �����ϼ��ڽ��ϱ�?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();

		if (confirm.equals("n"))
			return;

		int msg = bookShelf.deleteBook(title);
		if (msg == 1) {
			System.out.println("å�� �����Ͽ����ϴ�.");
		}
	}

	public static void clearBookShelf() {
		System.out.print("å�� ��� �����ϼ��ڽ��ϱ�?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();

		if (confirm.equals("y")) {
			bookShelf.clearBookShelf();
			System.out.println("å�� ��� �����Ͽ����ϴ�.");
		}
	}

	//���Ͽ� ����� å�� �������� �о���� �޼ҵ�
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

			// ����� ����ó��.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//���α׷��� ������ ���Ϸ� �����ϴ� �޼ҵ�
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

	}

}
