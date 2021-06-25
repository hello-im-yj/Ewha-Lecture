
/* 1748022 ±èÀ¯Áø
 * (½Ç½À)ÀºÇà ÀÜ°í
 * */

package pm1;

public class RunnableTest implements Runnable {
	Account account = new Account();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (account.balance > 0) {
			int money = (int) (Math.random() *3 +1) *100;
			account.withdraw(money);
			System.out.println(Thread.currentThread().getName() + " : balanced : "+ account.balance);
		}
		 
		account.deposit(1000);
		
		
	}
	

}
