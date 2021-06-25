
public class BookShelf {
	public static final int MAXCOUNT = 100;
	private Book[] books = new Book[MAXCOUNT];
	private int bookCount = 0;
	
	public int getBookCount() {
		return bookCount;
	}

	public String[] getBooks() {
		String[] booksInfoStr = new String[bookCount];
		for(int i = 0; i < bookCount; i++) {
			booksInfoStr[i] = books[i].print();
		}
		
		return booksInfoStr;
	}
	
	public Book selectBook(String title) {
		for(int i = 0; i < bookCount; i++) {
			if(books[i].getTitle().equals(title)) {
				return books[i];
			}
		}
		
		return null;
	}
	
	//오버로딩
	public Book selectBook(int index) {
		return books[index];
	}
	
	public int selectedBookIndex(String title) {
		for(int i = 0; i < bookCount; i++) {
			if(books[i].getTitle().equals(title)) {
				return i;
			}
		}
		
		return -1;
	}

	public void addBook(Book book) {
		books[bookCount] = book;	
		bookCount++; //책장의 책 증가
	}
	
	public int deleteBook(String title) {
		if(bookCount == 0) return 0;
		
		int selectedIndex = selectedBookIndex(title);
		if(selectedIndex == -1) return -1;
		
		for(int i = selectedIndex; i < bookCount-1; i++) {
			books[i] = books[i+1];
		}
		
		books[bookCount-1] = null;
		bookCount--;
		
		return 1;
	}
	
	public void clearBookShelf() {	
		for(int i = 0; i < bookCount; i++) {
			books[i] = null;
		}
		
		bookCount = 0;
	}
}
