/* 1748022 ������
 * (����1) final Modifier
 * */

package ex1;

public class MySoft {
	
	private String softName;
	private int softCost;
	
	//final������ ����� ���ÿ� �ʱ�ȭ, ��ü �����ڿ��� �ʱ�ȭ ��Ű�� �͵� ������.
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
