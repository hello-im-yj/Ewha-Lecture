/* 1748022 ������
 * (JAVA���α׷��ֹ׽ǽ� ���α׷��� ���� #2) å�� ���� ���α׷� Ȯ��
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

	// ����� å�� ������ �˱� ���ؼ� ArrayList�� size()�޼ҵ带 Ȱ���Ѵ�.
	// ���� �ڵ忡�� ����� å�� ������ �˱� ���� ����ߴ� count������ ��� books.size() �޼ҵ�� ��ü�� �� �ִ�.
	public int getBookCount() {
		return books.size();
	}

	// ArrayList�� get()�޼ҵ带 �̿��Ͽ� ���ϴ� ��ü�� �ҷ��� �� �ִ�.
	// ���� �ڵ忡�� ���� book[i]�� ��� books.get(i)�޼ҵ�� ��ü�� �� �ִ�.
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
		//// ArrayList�� add()�޼ҵ带 �̿��Ͽ� å ��ü�� �߰��Ѵ�.
		// �� ��, �迭�� ��������� �����ϸ� �ڵ����� ������ �迭���� ������ ū �迭�� �����Ͽ� �����ϰ� �ȴ�.
		books.add(book);
	}

	public int deleteBook(String title) {
		// å���� ����ִ� ���
		if (books.size() == 0)
			return 0;
		// �Է��� ������ å�� ���� ���
		int selectedIndex = selectedBookIndex(title);
		if (selectedIndex == -1)
			return -1;

		// �� ���� ���, remove()�޼ҵ带 Ȱ���Ͽ� ���������� ���� �۾��� �����Ѵ�.
		books.remove(selectedIndex);
		return 1; // ���������� ������ ���, 1�� ��ȯ�Ѵ�.
	}

	public void clearBookShelf() {
		//// ArrayList�� clear()�޼ҵ带 �̿��Ͽ� å���� å�� ��� ����.
		books.clear();
	}
}
