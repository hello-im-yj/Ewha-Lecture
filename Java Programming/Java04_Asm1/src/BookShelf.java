/* 1748022 김유진 */

import java.util.Scanner;

public class BookShelf {
	
	//필드 (캡슐화)
	final int MAXCOUNT = 100; //상수 100으로 초기화
	private Book[] booklist = new Book[MAXCOUNT]; //최대 100개의 Book type을 담을 수 있는 책 목록 배열을 선언한다.  
	private int numofBook=0; //현재 보관된 책의 수, 0으로 초기화한다. 

	//메소드
	
	//getter - 현재 보관된 책의 수를 반환한다. 
	public int getNumofBook() {
		return numofBook;
	}
	
	//getBooks()메소드 : 책장에 있는 모든 책의 간단한 정보를 출력한다. 
	public void getBooks() {
		/* 예외처리 : 현재 보관된 책의 개수가 0권일 때 배열을 읽으면 예외가 발생하기 때문에, 
		보관된 책이 없을 때에는 책이 없다는 메시지를 출력한 후 함수를 종료시킨다.   */
		if (numofBook==0) {
			System.out.println("보관된 책이 없습니다.");
			return;
		}
		//보관된 책이 있을 때에는 책이 채워진 배열의 칸을 모두 돌면서 print()매소드를 통해 책 정보를 출력한다. 
		for (int i=0; i<numofBook; i++) {
			booklist[i].print();
			System.out.println();
		}
	}
	
	//selectBook(제목) 메소드 : 사용자가 입력한 책의 제목에 해당하는 책을 찾아 출력한 후, 해당 객체를 반환한다. 
	public Book selectBook(String title) {
		//책이 채워진 배열을 모두 돌면서, 입력한 책의 제목과 같은 제목을 가진 책의 정보를 printDetail() 메소드를 이용하여 출력한다. 
		for (int i=0; i<numofBook; i++) {
			if (booklist[i].getTitle().equals(title)) {
				booklist[i].printDetail();
				return booklist[i]; //검색한 책에 해당하는 Book 객체를 리턴시킨다.  
			} 
		}
		//만약 검색된 책이 없다면 아래 메세지를 출력한 후, 해당하는 객체가 없으므로 null을 리턴한다. 
		System.out.println("검색된 책이 없습니다.");
		return null; 
	}
	
	//addBook(Book) 메소드 : main에서 사용자가 입력한 값을 받아 Book 객체를 생성하면, 이를 책장에 책을 추가한다. 
	public void addBook(Book book) {
		//현재까지 책이 채워진 칸 바로 다음에 book객체를 저장한다.  
		booklist[numofBook] = book;
		numofBook++; //보관된 책의 수를 1 증가시킨다. 

	}
	
	//deleteBook(제목) 메소드 : 사용자가 선택한 book객체를 책장에서 삭제한다. 
	public void deleteBook(String title) {
		//사용자가 입력한 제목과 동일한 제목을 가진 Book객체의 index를 찾아, 해당 index 뒤에 있는 배열을 한칸씩 앞으로 이동시킨다. 
		for (int i=0; i<numofBook;i++) {
			if (booklist[i].getTitle() == title) {
				for (int j=i;j<numofBook-1;j++) {
					booklist[j]=booklist[j+1];
				} //배열의 index를 벗어나는 상황을 피하기 위해 마지막 책장은 null로 직접 초기화한다. 
				booklist[numofBook-1] = null;
			}
		}
		numofBook--; //보관된 책의 수를 1 감소시킨다. 
	}
	
	//clearBookShelf() 메소드 : 
	public void clearBookShelf() {
		for (int i =0; i<numofBook; i++) {
			booklist[i] = null; //모든 책장의 책을 비운다. 
			numofBook = 0; //보관된 책의 수를 0으로 설정한다.  
		}
	}

}
