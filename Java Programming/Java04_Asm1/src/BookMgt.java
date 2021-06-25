/* 1748022 ������ */

import java.util.Scanner;

public class BookMgt {

	public static void main(String args[]) {

		BookShelf bookShelf = new BookShelf(); //å�� BookShelf��ü�� ����.
		boolean cont = true;
		 
		while (cont) {
			//cont���� false�� �� �� ���� (7�� �Էµ� ������) �Ʒ� �۾��� �ݺ��Ѵ�.
			
			int num = selectMenu();

			//����ڰ� �Է��� ���� ���� ���� �۾��� �����Ѵ�. 
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
				System.out.println("***** ���α׷��� �����մϴ�."); //���α׷� ���� �ȳ� �޼��� ���
				cont = false;
				break;
			}
		}
	}
	
	//sclectMenu() : ����ڿ��� �޴��� �����ְ� ������ �۾��� �ش��ϴ� ��ȣ�� �Է¹޴´�.
	public static int selectMenu() { 
		System.out.println("==========================================================================");
		System.out.println("1. å �߰�, 2. ��� å �˻�, 3. å �˻�, 4. å ����, 5. å ����, 6. ��� å ����, 7. ����");
		System.out.println("==========================================================================");
		System.out.println("�޴��� �����ϼ��� >> ");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt(); //Scanner��ü�� �̿��Ͽ� ����ڰ� �Է��� ���� int �������� ��ȯ�Ѵ�. 
	}

	//insertBookInfo(Bookshelf) : å ��ü�� �����ϰ�, ����ڿ��� å�� ������ ������ �Է¹޾� å�忡 å�� �߰��Ѵ�. 
	public static void insertBookInfo(BookShelf bookshelf) {
		System.out.println("å�� ������ �Է��ϼ���. (����, ���ǻ�, å���� ������ �Է�)");

		Book b = new Book();  //å(Book type) ��ü ����, 
		//�ʵ尡 ��� Default������ �Ǿ� �����Ƿ� ���� setter�� �̿��Ͽ� �ʵ带 �ʱ�ȭ�Ѵ�. 

		Scanner sc = new Scanner(System.in);
		b.setTitle(sc.nextLine()); //������ å ��ü�� ���� �ʵ忡 ����ڰ� �Է��� ���� �����Ѵ�. 
		b.setPublisher(sc.nextLine()); //������ å ��ü�� ���ǻ� �ʵ忡 ����ڰ� �� ���� �Է��� ���� �����Ѵ�. 
		b.setType(sc.nextLine()); //������ å ��ü�� Ÿ�� �ʵ忡 ����ڰ� �� ���� �Է��� ���� �����Ѵ�. 

		b.setAuthor(addAuthor()); //AddAuthor()�ż��忡�� ������ ���� ��ü�� ���Ϲ޾�, å ��ü�� Author�ʵ忡 �����Ѵ�. 
		bookshelf.addBook(b); //bookshelf ��ü�� addBook()�ż��带 �̿��Ͽ� å�忡 å�� �߰��Ѵ�. 
		
	}

	//addAuthor() : ���� ��ü�� �����ϰ�, ����ڿ��� ���� ������ �Է¹޴´�. 
	public static Author addAuthor() {
		System.out.println("���� ������ �Է��ϼ���.(�̸�, �������(yyyy-mm-dd), ����(��:1 ��:2), ��� ������ �Է�)");

		Scanner sc = new Scanner(System.in);
		Author a = new Author(); //����(Author type) ��ü ����
		
		a.setName(sc.nextLine()); //������ ���� ��ü�� �̸� �ʵ忡 ����ڰ� �Է��� ���� �����Ѵ�. 
		a.setBirth(sc.nextLine()); //������ ���� ��ü�� ������� �ʵ忡 �� ���� �Է��� ���� �����Ѵ�.
		// ����ڰ� ��������� ���˿� ���� �ʰ� �Է��� ��쿡�� Person class�� Setter���� ó���Ѵ�.
		String num = sc.nextLine(); //������ ���� ��ü�� ������ �����ϱ� ���� �� ���� �Է��� ���� ���� num�� �����Ѵ�. 
		//���� �Էµ� ���� 1�̸� ��ü�� ������ MAN����, 2�̸� WOMAN����, �� ���� ���ڴ� UNKNOWN���� �����Ѵ�. 
			try { int genNum = Integer.parseInt(num);
			if (genNum == 1) {a.setGender(Person.Gender.MAN);} 
			else if (genNum == 2) {a.setGender(Person.Gender.WOMAN);} 
			else {a.setGender(Person.Gender.UNKNOWN);}
			}
			catch (NumberFormatException e){ a.setGender(Person.Gender.UNKNOWN);  }
			// ���� ���� ���� �ԷµǾ��� ���� ����ó���� ���� ������ UNKNOWN���� ó���Ѵ�. 
		a.setCareer(sc.nextLine()); //������ ���� ��ü�� ��� �ʵ忡 �� ���� �Է��� ���� �����Ѵ�. 		
		return a; // ������ Author��ü�� ȣ���� ������ ��ȯ�Ѵ�. 
	}

	//showAllBookInfo(BookShelf) : å�忡 �ִ� ��� å�� ����� �����ش�. 
	public static void showAllBookInfo(BookShelf bookShelf){
		System.out.println("[�� "+bookShelf.getNumofBook()+"��]"); //å�忡 �ִ� �� å�� �Ǽ� ���
		System.out.println();
		bookShelf.getBooks(); //bookShelf��ü�� getBooks()�޼ҵ带 ���� å�忡 �ִ� ��� å�� ������ ������ ����Ѵ�. 
	}
	
	//selectBookInfo(BookShelf) : ����ڿ��� ������ �Է¹޾� �ش� å�� �������� �����ش�. 
	public static void selectBookInfo(BookShelf bookShelf){
		System.out.println("�˻��� å�� ������ �Է��ϼ���.");
		Scanner sc= new Scanner(System.in);
		bookShelf.selectBook(sc.nextLine());  
		//����ڰ� �Է��� å�� ������ �Ű������� bookShelf ��ü�� selectBook()�޼ҵ带 ȣ���Ѵ�.
	}
	
	//updateBookInfo(BookShelf) : ����ڿ��� ������ �Է¹޾� �ش� å�� ���� �Ǵ� ����� ���ǻ縦 �����Ѵ�. 
	public static void updateBookInfo(BookShelf bookShelf){
		System.out.println("������ å�� ������ �Է��ϼ���.");
		Scanner sc= new Scanner(System.in);
		String title = sc.nextLine();
		Book b = bookShelf.selectBook(title); 
		//����ڰ� �Է��� ����� ��ġ�ϴ� å�� ������ ����� ��, �ش� Book��ü�� b�� �����Ѵ�. 
			if (b == null) return; //���� ����ڰ� �Է��� ����� ��ġ�ϴ� å ��ü�� ���ٸ� �Լ��� �����Ѵ�. 

		//���� ����
		System.out.println();
		System.out.println("���ο� ������ �Է��ϼ���.");
		String newTitle = sc.nextLine();
		//����ڰ� �Է��� ���ο� ������ newTitle�� �����س��´�. 
		
		System.out.println("���ǻ縦 �����Ͻðڽ��ϱ�? (y or n)");
		String check = sc.nextLine(); 
			if (check.equals("y") || check.equals("Y") ) {
				//���ǻ縦 �����Ѵٸ�, ���ǻ� ���� �Է¹޾� ����� �Բ� �����Ѵ�. 
				System.out.println("���ο� ���ǻ縦 �Է��ϼ���.");
				b.update(newTitle, sc.nextLine());
			}
			else if (check.equals("n") || check.equals("N") )  {
				//���ǻ縦 �������� ������ ���� �����Ѵ�. 
				b.update(newTitle);
			}
			//���� �Էµ� ���ڰ� Y,y,n,N �߿� ���ٸ� ������ ����ϰ� ���� ������ �����Ѵ�. 
			else {System.out.println("�߸��� �Է��Դϴ�."); return;}
		
		b.printDetail(); //������ ���� ���
		
	}

	//removeBookFromBookShelf(BookShelf) : ����ڿ��� ������ �Է¹޾�, �ش� å�� å�忡�� �����Ѵ�. 
	public static void removeBookFromBookShelf(BookShelf bookShelf){
		System.out.println("������ å�� ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String delTitle = sc.nextLine();
		Book b = bookShelf.selectBook(delTitle);
		//����ڰ� �Է��� ����� ��ġ�ϴ� å�� ������ ����� ��, �ش� Book��ü�� ���Ϲ޾� b�� �����Ѵ�. 
			if (b == null) return; //���� ����ڰ� �Է��� ����� ��ġ�ϴ� å ��ü�� ���ٸ� �Լ��� �����Ѵ�. 
		System.out.println("���� å�� �����Ͻðڽ��ϱ�?(y or n)"); //����ڿ��� �ش� å�� �����ϰڳİ� Ȯ���� �޴´�. 
		String check = sc.nextLine();
			if (check.equals("y") || check.equals("Y") ) {
			//����ڰ� �Է��� ���� Y�� y�϶���  å�� �����Ѵ�. 
				bookShelf.deleteBook(delTitle);	
				System.out.println("������ å�� �����߽��ϴ�.");
			}
			//����ڰ� ������ ���� n,N�̰ų� �߸��� �Է°��̸� �޼ҵ带 �����Ѵ�. 
			else if (check.equals("n") || check.equals("N") )  { return;}
			else {System.out.println("�߸��� �Է��Դϴ�."); return;}
	}

	//clearBookShelf(BookShelf) : å�忡 �ִ� ��� å�� �����Ѵ�. 
	public static void clearBookShelf(BookShelf bookShelf){
		System.out.println("���� ��� å�� �����Ͻðڽ��ϱ�? (y or n)"); //����ڿ��� ��� å�� �����ϰڳİ� Ȯ���� �޴´�. 
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		if (check.equals("y") || check.equals("Y") ) {
		//����ڰ� �Է��� ���� Y�� y�϶��� ��� å�� �����Ѵ�.
			bookShelf.clearBookShelf();	
			System.out.println("��� å�� �����߽��ϴ�."); //���������� �����Ǿ����� �����Ǿ��ٴ� �ȳ� �޼��� ���
		}
		//����ڰ� ������ ���� n,N�̰ų� �߸��� �Է°��̸� �޼ҵ带 �����Ѵ�.
		else if (check.equals("n") || check.equals("N") )  { return;}
		else {System.out.println("�߸��� �Է��Դϴ�."); return;}
		
	}



}
