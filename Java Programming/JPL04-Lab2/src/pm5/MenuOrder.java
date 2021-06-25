
package pm5;

public class MenuOrder {
	
	private int cokePrice ;
	private int lemonPrice ;
	private int coffeePrice ;
	private int change;
	
	public int getCokePrice() {
		return cokePrice;
	}
	public int getLemonPrice() {
		return lemonPrice;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCokePrice(int m) {
		this.cokePrice = m;
	}
	public void setLenomPrice(int m) {
		this.lemonPrice = m;
	}
	public void setCoffeePrice(int m) {
		this.coffeePrice = m;
	}
	
	public void showMenu() {
		System.out.println("--- Select Drink ---");
		System.out.printf("0: Coke. %d \n",cokePrice);
		System.out.printf("1: Lemonade. %d \n",lemonPrice);
		System.out.printf("2: Coffee. %d \n", coffeePrice);
	}
	
	public void drinkCost(int menu, int inmoney) {
		switch (menu) {
		case 0: 
			change = inmoney - cokePrice;
			break;
		case 1: 
			change = inmoney - lemonPrice;
			break;
		case 2: 
			change = inmoney - coffeePrice;
			break;
		}
	}
	
	public void showResult(int menu) {
		
		System.out.println("You selected " + menu);
		System.out.println("your change is " + change);
		System.out.println("Do you want to continue? (y/n)");
	}
	


}
