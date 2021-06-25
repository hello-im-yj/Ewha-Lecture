/* 1748022 김유진
 * (JAVA프로그래밍및실습 프로그래밍 과제 #2) 책장 관리 프로그램 확장
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

	// 저장된 책의 개수를 알기 위해서 ArrayList의 size()메소드를 활용한다.
	// 기존 코드에서 저장된 책의 개수를 알기 위해 사용했던 count변수는 모두 books.size() 메소드로 대체할 수 있다.
	public int getBookCount() {
		return books.size();
	}

	// ArrayList의 get()메소드를 이용하여 원하는 객체를 불러올 수 있다.
	// 기존 코드에서 사용된 book[i]는 모두 books.get(i)메소드로 대체할 수 있다.
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

	public int selectedBookIndex(String title) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}

	public void addBook(Book book) {
		//// ArrayList의 add()메소드를 이용하여 책 객체를 추가한다.
		// 이 때, 배열의 저장공간이 부족하면 자동으로 기존의 배열보다 공간이 큰 배열을 생성하여 저장하게 된다.
		books.add(book);
	}

	public int deleteBook(String title) {
		// 책장이 비어있는 경우
		if (books.size() == 0)
			return 0;
		// 입력한 제목의 책이 없는 경우
		int selectedIndex = selectedBookIndex(title);
		if (selectedIndex == -1)
			return -1;

		// 그 외의 경우, remove()메소드를 활용하여 정상적으로 삭제 작업을 진행한다.
		books.remove(selectedIndex);
		return 1; // 정상적으로 삭제된 경우, 1을 반환한다.
	}

	public void clearBookShelf() {
		//// ArrayList의 clear()메소드를 이용하여 책장의 책을 모두 비운다.
		books.clear();
	}
}
