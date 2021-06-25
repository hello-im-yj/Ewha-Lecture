
/* 1748022 ������
 * (JAVA���α׷��ֹ׽ǽ� ���α׷��� ���� #3) å�� ���� ���α׷� GUI 
 * */

import java.io.Serializable;
import java.util.ArrayList;

//��ü ������ ������ϱ� ����, Serializable �������̽��� �����Ѵ�. 
public class BookShelf implements Serializable {
	// Book[] books �κ��� ArrayList�� Ȱ���ϴ� ���α׷����� �����Ͽ���.
	private ArrayList<Book> books = new ArrayList<Book>();

	// ��ü ���� ������� ����, books�� getter�� setter�� �����Ͽ���.
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

	// index�� �̿��Ͽ� å�� �˻��� �� �ִ� �޼��带 �����ε��Ͽ���.
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
		// GUIBookMgt���� ����ڰ� �Է��� å�� ������ ������ ���� deleteBook()�޼ҵ尡 ����ǵ��� �ڵ带 �ۼ��Ͽ���.
		// ���� ���� #2�� �޸�, int�� �����ϴ� �Լ��� �ƴ� void �Լ��� �����Ͽ���.
		int selectedIndex = selectedBookIndex(title);
		books.remove(selectedIndex);
	}

	public void clearBookShelf() {
		books.clear();
	}
}
