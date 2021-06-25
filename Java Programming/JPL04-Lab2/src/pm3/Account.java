/* 1748022 김유진
 * (실습3) 은행 계정 관리
 * */

package pm3;

public class Account {
	
	private int balance;
	private String owner;
	private double rate;
	
	public Account(String owner, int balance,  double rate) {
		this.balance = balance;
		this.owner = owner;
		this.rate = rate;
	}

	public Account(String owner, double rate) {
		this.owner = owner;
		this.rate = rate;
		this.balance =0;
	}
	
	
	public void deposit (int m) {
		balance += m;
	}
	
	public void withdraw(int m) {
		balance -= m;
	}
	
	public void computeTotal() { //1달치 이자
		balance += balance*rate/12.0;
	}
	
	public void computeTotal(int m) { //n달치 이자
		balance += balance*rate/12.0*m;
	}
	
	public void showAll() {
		System.out.println("Owner = "+owner);
		System.out.println("Balance = "+balance);
		System.out.println("Rate = "+rate);		
	}
	
	public void showBalance() {
		System.out.println("Balance = "+balance);
		
	}
	
	public void showOwner() {
		System.out.println("Owner = "+owner);
		
	}
	
	public void showRate() {
		System.out.println("Rate = "+rate);	
		
	}
	
	

}
