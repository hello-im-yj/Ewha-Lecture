package pm1;

public class Product {
	
	//�ʵ�
	private int productID;
	private String description;
	private String maker;
	private int price;
	
	
	//������
	
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
		System.out.println("��ǰID>> "+productID);
		System.out.println("��ǰ ����>> "  + description);
		System.out.println("������>> "+maker);
		System.out.println("����>>"+price);
	}
	
}//end of main
