/* 1748022 김유진
 * (실습3) 은행 계정 관리
 * */

package pm3;

public class AccountDemo {
	
	public static void main (String args[]) {
		
		Account a1 = new Account("kim",1000,0.03);
		Account a2 = new Account ("Lee",0.04);
		Account a3 = new Account("Park",2000,0.05);
		
		a1.showAll();
		a2.showAll();
		a3.showAll();
		System.out.println();
		
		a1.deposit(300);
		a2.deposit(300);
		a3.deposit(300);
		
		a1.withdraw(100);
		a2.withdraw(100);
		a3.withdraw(100);
		
		a1.computeTotal(5);
		a2.computeTotal(5);
		a3.computeTotal(5);
		
		a1.showOwner();
		a2.showOwner();
		a3.showOwner();
		System.out.println();
		
		a1.showBalance();
		a2.showBalance();
		a3.showBalance();
		
	}

}
