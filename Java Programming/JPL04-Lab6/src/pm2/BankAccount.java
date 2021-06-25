/* 1748022 김유진
 * (실습2) 예금 관리 시스템
 * */

package pm2;

public class BankAccount {
	
	private int balance; //초기화하려면 필드 옆에 말고 생성자 안에 리터럴 값 써야함.
	//private String name;

	public BankAccount() {
		balance = 50000;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
