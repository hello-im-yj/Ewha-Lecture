/* 1748022 김유진
 * (실습2) 예금 관리 시스템
 * */

package pm2;

import java.util.Scanner;

public class AtmClient {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount();
		
		boolean ctn = true;
		while (ctn) {
			
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 통장 정보 출력   2. 현금 인출   3. 예금 입금");
			System.out.println("(끝내려면 0을 입력하세요)");
			try {
			int input = sc.nextInt();
			
			switch (input) {
			case 0: ctn = false; continue;
			
			case 1: System.out.println("잔액: "+account.getBalance()); break;
			
			case 2: System.out.println("얼마 인출하시겠습니까?");
				int withdraw = sc.nextInt();
				
				if (withdraw > account.getBalance()) 
					throw new NotEnoughMoneyException("NotEnoughMoneyException : !! 잔액이 충분하지 않습니다.");
				if (withdraw < 0) 
					throw new InvalidMoneyException ("InvalidMoneyException : !! 입금 액수가 잘 못 되었습니다.");
				
				account.setBalance(account.getBalance() - withdraw);
				System.out.println("현재 잔액: "+account.getBalance());
				break;
			case 3: 
				System.out.println("얼마 입금하시겠습니까?");
				int deposit = sc.nextInt();
				if (deposit < 0) 
					throw new InvalidMoneyException ("InvalidMoneyException : !! 입금 액수가 잘 못 되었습니다.");
				
				account.setBalance(account.getBalance()+deposit);
				System.out.println("현재 잔액: "+account.getBalance());
				break;
			} //end of switch
			
			} //end of try
			
			catch (NotEnoughMoneyException e) {
				System.out.println(e.getMessage());
				System.out.println("현재 잔액: "+account.getBalance());
			}
			
			catch (InvalidMoneyException e) {
				System.out.println(e.getMessage());
				System.out.println("현재 잔액: "+account.getBalance());
			}
			

		}//end of while
		System.out.println("프로그램 종료.");
		
	}//end of main

}
