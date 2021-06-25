/* 1748022 ±èÀ¯Áø
 * 
 * */

package test;

public class Goods {
	
	private String name ;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public Goods (String name, int price, int numberOfStock, int sold) {
		
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
		
	}
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	public int getNumberOfStock() {return numberOfStock;}
	public int getSold() {return sold;}
	

}
