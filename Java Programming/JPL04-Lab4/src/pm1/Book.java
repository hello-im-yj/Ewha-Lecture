package pm1;

public class Book extends Product{

	private int ISBN;
	private String title;
	private String author;
	
	public Book(int productID, String description, String maker, int price, int iSBN, String title, String author) {
		super(productID, description, maker, price);
		ISBN = iSBN;
		this.title = title;
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ISBN>> "+ISBN);
		System.out.println("å ����>> "+ title);
		System.out.println("����>> "+author);
	}
	
	
	

}
