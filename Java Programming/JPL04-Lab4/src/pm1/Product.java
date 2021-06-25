package pm1;

public class Product {
	
	//필드
	private int productID;
	private String description;
	private String maker;
	private int price;
	
	
	//생성자
	
	public Product(int productID, String description, String maker, int price) {
		super();
		this.productID = productID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}


	//Getter&Setter
	
	public int getProductID() {
		return productID;
	}


	public String getDescription() {
		return description;
	}


	public String getMaker() {
		return maker;
	}


	public int getPrice() {
		return price;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품ID>> "+productID);
		System.out.println("상품 설명>> "  + description);
		System.out.println("생산자>> "+maker);
		System.out.println("가격>>"+price);
	}
	
}//end of main
