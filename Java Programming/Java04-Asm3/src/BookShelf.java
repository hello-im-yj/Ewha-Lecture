
/* 1748022 김유진
 * (JAVA프로그래밍및실습 프로그래밍 과제 #3) 책장 관리 프로그램 GUI 
 * */

import java.io.Serializable;
import java.util.ArrayList;

//객체 단위로 입출력하기 위해, Serializable 인터페이스를 구현한다. 
public class BookShelf implements Serializable {
	// Book[] books 부분을 ArrayList를 활용하는 프로그램으로 수정하였다.
	private ArrayList<Book> books = new ArrayList<Book>();

	// 객체 단위 입출력을 위해, books의 getter와 setter를 생성하였다.
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public int getBookCount() {
		return books.size();
	}

	public String[] getAllBooks() {
		String[] booksInfoStr = new String[books.size()];
		for (int i = 0; i < books.size(); i++) {
			booksInfoStr[i] = books.get(i).print();
		}

		return booksInfoStr;
	}

	public Book selectBook(String title) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title)) {
				return books.get(i);
			}
		}

		return null;
	}

	// index를 이용하여 책을 검색할 수 있는 메서드를 오버로딩하였다.
	public Book selectBook(int index) {
		if (index <= books.size() && index > -1)
			return books.get(index);
		return null;
	}

	public int selectedBookIndex(String title) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void deleteBook(String title) {
		// GUIBookMgt에서 사용자가 입력한 책의 제목이 존재할 때만 deleteBook()메소드가 실행되도록 코드를 작성하였다.
		// 따라서 과제 #2와 달리, int를 리턴하는 함수가 아닌 void 함수로 수정하였다.
		int selectedIndex = selectedBookIndex(title);
		books.remove(selectedIndex);
	}

	public void clearBookShelf() {
		books.clear();
	}
}
