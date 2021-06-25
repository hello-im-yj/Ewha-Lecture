/* 1748022 김유진
 * (JAVA프로그래밍및실습 프로그래밍 과제 #2) 책장 관리 프로그램 확장
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

		// 프로그램이 시작될 때 파일에 저장된 책의 정보를 읽어 배열에 저장한다.
		readData();

		while (true) {
			int menu = showMenu();
			if (menu == 7)
				break;

			switch (menu) {
			case 0: // 숫자 아닌 문자를 입력한 경우, 혹은 메뉴 번호 범위에 해당하지 않는 숫자를 입력한 경우.
				continue; // 사용자에게 menu를 다시 입력받는다.
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

		System.out.println("프로그램을 종료합니다.");

		// 프로그램이 종료될 때, 책의 정보를 파일에 저장한다.
		writeData();
		scan.close();
	}

	public static int showMenu() {
		System.out.println("========================================================");
		System.out.println("1.책 추가 2.모든 책 검색 3.책 검색 4.책 수정 5.책 삭제 6.모든 책 삭제 7.종료");
		System.out.println("========================================================");
		int menu = -1;

		try {
			System.out.print("메뉴를 선택하세요 >> ");
			menu = Integer.parseInt(scan.nextLine());
			// 메뉴 번호 범위에 해당하지 않는 숫자를 입력한 경우 예외를 발생시킨다.
			if (menu > 7 || menu < 1)
				throw new Exception(); 
		} catch (NumberFormatException e) {
			// 숫자가 아닌 문자를 입력한 경우 다음의 에러 메세지가 출력된후, 0을 반환한다.
			System.out.println("정수 타입으로 입력해주세요.");
			return 0;
		} catch (Exception e) {
			// 메뉴 번호 범위에 해당하지 않는 숫자를 입력한 경우 다음의 에러 메세지가 출력된후, 0을 반환한다.
			System.out.println("메뉴 번호 범위에 해당하는 숫자를 입력해주세요. ");
			return 0;
		}

		System.out.println();
		return menu;
	}

	public static void insertBookInfo() {
		System.out.println("책의 정보를 입력하세요.(제목, 출판사, 책종류 순으로 입력)");
		System.out.print("제목 >> ");
		String title = scan.nextLine();
		System.out.print("출판사 >> ");
		String publisher = scan.nextLine();
		System.out.print("책종류 >> ");
		String type = scan.nextLine();

		System.out.println();
		System.out.println("저자 정보를 입력하세요.(이름, 생년월일, 성별(남:1, 여:2), 경력 순으로 입력)");
		System.out.print("이름 >> ");
		String name = scan.nextLine();
		System.out.print("생년월일 >> ");
		String birthdate = scan.nextLine();

		int g = 0;
		Gender gender = Gender.UNKNOWN;
		try { // 성별에 적절한 값을 입력하지 않은 경우, 에러처리를 통해 성별이 UNKNOWN으로 설정되도록 했다.
			System.out.print("성별 >> ");
			g = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
		}
		System.out.print("경력 >> ");
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
		System.out.println(String.format("총 %d권의 책이 있습니다.", bookShelf.getBookCount()));
		System.out.println(deco);

		for (String s : bookInfos) {
			System.out.println(s);
		}
	}

	public static void selectBookInfo() {
		System.out.print("검색할 책의 제목을 입력하세요 >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if (selectedBook == null) {
			System.out.println("검색된 책이 없습니다.");
			return;
		}

		System.out.println(selectedBook.printDetatil());
	}

	public static void updateBookInfo() {
		System.out.print("수정할 책의 제목을 입력하세요 >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if (selectedBook == null) {
			System.out.println("수정할 책이 없습니다.");
			return;
		}

		System.out.print("새 제목을 입력하세요 >> ");
		String newtitle = scan.nextLine();

		System.out.print("출판사도 수정하시겠습니까?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();

		if (confirm.equals("y")) {
			System.out.print("새 출판사를 입력하세요 >> ");
			String newpublisher = scan.nextLine();

			selectedBook.update(newtitle, newpublisher);
		} else {
			selectedBook.update(newtitle);
		}

		System.out.println("수정이 완료되었습니다.");
	}

	public static void removeBookFromBookShelf() {
		System.out.print("삭제할 책의 제목을 입력하세요 >> ");
		String title = scan.nextLine();

		Book selectedBook = bookShelf.selectBook(title);
		if (selectedBook == null) {
			System.out.println("삭제할 책이 없습니다.");
			return;
		}

		System.out.println(selectedBook.printDetatil());
		System.out.print("책을 정말 삭제하세겠습니까?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();

		if (confirm.equals("n"))
			return;

		int msg = bookShelf.deleteBook(title);
		if (msg == 1) {
			System.out.println("책을 삭제하였습니다.");
		}
	}

	public static void clearBookShelf() {
		System.out.print("책을 모두 삭제하세겠습니까?(y or n) >> ");
		String confirm = scan.nextLine().toLowerCase();

		if (confirm.equals("y")) {
			bookShelf.clearBookShelf();
			System.out.println("책을 모두 삭제하였습니다.");
		}
	}

	//파일에 저장된 책의 정보들을 읽어오는 메소드
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

			// 입출력 예외처리.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//프로그램의 정보를 파일로 저장하는 메소드
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

	}

}
