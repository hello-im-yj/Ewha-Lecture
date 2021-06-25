/* 1748022 김유진 */

import java.util.Scanner;

public class BookMgt {

	public static void main(String args[]) {

		BookShelf bookShelf = new BookShelf(); //책장 BookShelf객체를 생성.
		boolean cont = true;
		 
		while (cont) {
			//cont값이 false가 될 때 까지 (7이 입력될 때까지) 아래 작업을 반복한다.
			
			int num = selectMenu();

			//사용자가 입력한 값에 따라 다음 작업을 수행한다. 
			switch (num) {
			case 1:
				insertBookInfo(bookShelf);
				break;
			case 2:
				showAllBookInfo(bookShelf);
				break;
			case 3:
				selectBookInfo(bookShelf);
				break;
			case 4:
				updateBookInfo(bookShelf);
				break;
			case 5:
				removeBookFromBookShelf(bookShelf);
				break;
			case 6:
				clearBookShelf(bookShelf);
				break;
			case 7:
				System.out.println("***** 프로그램을 종료합니다."); //프로그램 종료 안내 메세지 출력
				cont = false;
				break;
			}
		}
	}
	
	//sclectMenu() : 사용자에게 메뉴를 보여주고 수행할 작업에 해당하는 번호를 입력받는다.
	public static int selectMenu() { 
		System.out.println("==========================================================================");
		System.out.println("1. 책 추가, 2. 모든 책 검색, 3. 책 검색, 4. 책 수정, 5. 책 삭제, 6. 모든 책 삭제, 7. 종료");
		System.out.println("==========================================================================");
		System.out.println("메뉴를 선택하세요 >> ");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt(); //Scanner객체를 이용하여 사용자가 입력한 값을 int 형식으로 반환한다. 
	}

	//insertBookInfo(Bookshelf) : 책 객체를 생성하고, 사용자에게 책과 저자의 정보를 입력받아 책장에 책을 추가한다. 
	public static void insertBookInfo(BookShelf bookshelf) {
		System.out.println("책의 정보를 입력하세요. (제목, 출판사, 책종류 순으로 입력)");

		Book b = new Book();  //책(Book type) 객체 생성, 
		//필드가 모두 Default값으로 되어 있으므로 직접 setter를 이용하여 필드를 초기화한다. 

		Scanner sc = new Scanner(System.in);
		b.setTitle(sc.nextLine()); //생성한 책 객체의 제목 필드에 사용자가 입력한 값을 저장한다. 
		b.setPublisher(sc.nextLine()); //생성한 책 객체의 출판사 필드에 사용자가 그 다음 입력한 값을 저장한다. 
		b.setType(sc.nextLine()); //생성한 책 객체의 타입 필드에 사용자가 그 다음 입력한 값을 저장한다. 

		b.setAuthor(addAuthor()); //AddAuthor()매세드에서 생성한 저자 객체를 리턴받아, 책 객체의 Author필드에 저장한다. 
		bookshelf.addBook(b); //bookshelf 객체의 addBook()매서드를 이용하여 책장에 책을 추가한다. 
		
	}

	//addAuthor() : 저자 객체를 생성하고, 사용자에게 저자 정보를 입력받는다. 
	public static Author addAuthor() {
		System.out.println("저자 정보를 입력하세요.(이름, 생년월일(yyyy-mm-dd), 성별(남:1 여:2), 경력 순으로 입력)");

		Scanner sc = new Scanner(System.in);
		Author a = new Author(); //저자(Author type) 객체 생성
		
		a.setName(sc.nextLine()); //생성한 저자 객체의 이름 필드에 사용자가 입력한 값을 저장한다. 
		a.setBirth(sc.nextLine()); //생성한 저자 객체의 생년월일 필드에 그 다음 입력한 값을 저장한다.
		// 사용자가 생년월일을 포맷에 맞지 않게 입력한 경우에는 Person class의 Setter에서 처리한다.
		String num = sc.nextLine(); //생성한 저자 객체의 성별을 설정하기 위해 그 다음 입력한 값을 변수 num에 저장한다. 
		//만약 입력된 값이 1이면 객체의 성별을 MAN으로, 2이면 WOMAN으로, 그 외의 숫자는 UNKNOWN으로 설정한다. 
			try { int genNum = Integer.parseInt(num);
			if (genNum == 1) {a.setGender(Person.Gender.MAN);} 
			else if (genNum == 2) {a.setGender(Person.Gender.WOMAN);} 
			else {a.setGender(Person.Gender.UNKNOWN);}
			}
			catch (NumberFormatException e){ a.setGender(Person.Gender.UNKNOWN);  }
			// 숫자 외의 값이 입력되었을 때는 예외처리를 통해 성별을 UNKNOWN으로 처리한다. 
		a.setCareer(sc.nextLine()); //생성한 저자 객체의 경력 필드에 그 다음 입력한 값을 저장한다. 		
		return a; // 생성한 Author객체를 호출한 곳으로 반환한다. 
	}

	//showAllBookInfo(BookShelf) : 책장에 있는 모든 책의 목록을 보여준다. 
	public static void showAllBookInfo(BookShelf bookShelf){
		System.out.println("[총 "+bookShelf.getNumofBook()+"권]"); //책장에 있는 총 책의 권수 출력
		System.out.println();
		bookShelf.getBooks(); //bookShelf객체의 getBooks()메소드를 통해 책장에 있는 모든 책의 간단한 정보를 출력한다. 
	}
	
	//selectBookInfo(BookShelf) : 사용자에게 제목을 입력받아 해당 책의 상세정보를 보여준다. 
	public static void selectBookInfo(BookShelf bookShelf){
		System.out.println("검색할 책의 제목을 입력하세요.");
		Scanner sc= new Scanner(System.in);
		bookShelf.selectBook(sc.nextLine());  
		//사용자가 입력한 책의 제목을 매개변수로 bookShelf 객체의 selectBook()메소드를 호출한다.
	}
	
	//updateBookInfo(BookShelf) : 사용자에게 제목을 입력받아 해당 책의 제목 또는 제목과 출판사를 수정한다. 
	public static void updateBookInfo(BookShelf bookShelf){
		System.out.println("수정할 책의 제목을 입력하세요.");
		Scanner sc= new Scanner(System.in);
		String title = sc.nextLine();
		Book b = bookShelf.selectBook(title); 
		//사용자가 입력한 제목과 일치하는 책의 정보를 출력한 후, 해당 Book객체를 b에 저장한다. 
			if (b == null) return; //만약 사용자가 입력한 제목과 일치하는 책 객체가 없다면 함수를 종료한다. 

		//제목 수정
		System.out.println();
		System.out.println("새로운 제목을 입력하세요.");
		String newTitle = sc.nextLine();
		//사용자가 입력한 새로운 제목을 newTitle에 저장해놓는다. 
		
		System.out.println("출판사를 수정하시겠습니까? (y or n)");
		String check = sc.nextLine(); 
			if (check.equals("y") || check.equals("Y") ) {
				//출판사를 수정한다면, 출판사 명을 입력받아 제목과 함께 수정한다. 
				System.out.println("새로운 출판사를 입력하세요.");
				b.update(newTitle, sc.nextLine());
			}
			else if (check.equals("n") || check.equals("N") )  {
				//출판사를 수정하지 않으면 제목만 수정한다. 
				b.update(newTitle);
			}
			//만약 입력된 문자가 Y,y,n,N 중에 없다면 다음을 출력하고 정보 수정을 종료한다. 
			else {System.out.println("잘못된 입력입니다."); return;}
		
		b.printDetail(); //수정된 정보 출력
		
	}

	//removeBookFromBookShelf(BookShelf) : 사용자에게 제목을 입력받아, 해당 책을 책장에서 삭제한다. 
	public static void removeBookFromBookShelf(BookShelf bookShelf){
		System.out.println("삭제할 책의 제목을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String delTitle = sc.nextLine();
		Book b = bookShelf.selectBook(delTitle);
		//사용자가 입력한 제목과 일치하는 책의 정보를 출력한 후, 해당 Book객체를 리턴받아 b에 저장한다. 
			if (b == null) return; //만약 사용자가 입력한 제목과 일치하는 책 객체가 없다면 함수를 종료한다. 
		System.out.println("정말 책을 삭제하시겠습니까?(y or n)"); //사용자에게 해당 책을 삭제하겠냐고 확인을 받는다. 
		String check = sc.nextLine();
			if (check.equals("y") || check.equals("Y") ) {
			//사용자가 입력한 값이 Y나 y일때만  책을 삭제한다. 
				bookShelf.deleteBook(delTitle);	
				System.out.println("선택한 책을 삭제했습니다.");
			}
			//사용자가 선택한 값이 n,N이거나 잘못된 입력값이면 메소드를 종료한다. 
			else if (check.equals("n") || check.equals("N") )  { return;}
			else {System.out.println("잘못된 입력입니다."); return;}
	}

	//clearBookShelf(BookShelf) : 책장에 있는 모든 책을 삭제한다. 
	public static void clearBookShelf(BookShelf bookShelf){
		System.out.println("정말 모든 책을 삭제하시겠습니까? (y or n)"); //사용자에게 모든 책을 삭제하겠냐고 확인을 받는다. 
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		if (check.equals("y") || check.equals("Y") ) {
		//사용자가 입력한 값이 Y나 y일때만 모든 책을 삭제한다.
			bookShelf.clearBookShelf();	
			System.out.println("모든 책을 삭제했습니다."); //성공적으로 삭제되었으면 삭제되었다는 안내 메세지 출력
		}
		//사용자가 선택한 값이 n,N이거나 잘못된 입력값이면 메소드를 종료한다.
		else if (check.equals("n") || check.equals("N") )  { return;}
		else {System.out.println("잘못된 입력입니다."); return;}
		
	}



}
