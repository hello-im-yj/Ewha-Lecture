/* 1748022 김유진
 * (예제1) final Modifier
 * */

package ex1;

public class MySoft {
	
	private String softName;
	private int softCost;
	
	//final변수는 선언과 동시에 초기화, 객체 생성자에서 초기화 시키는 것도 가능함.
	private final int softTax; // = 10;
	public MySoft() {softTax =10;}
	
	public static int softTotal =0;
	
	public String getSoftName() {
		return softName;
	}
	public int getSoftCost() {
		return softCost;
	}
	public void setSoftName(String softName) {
		this.softName = softName;
	}
	public void setSoftCost(int cost) {
		this.softCost = cost + (cost*softTax/100);
		softTotal = softTotal+softCost;
	}

	
	
	
	
	
}
