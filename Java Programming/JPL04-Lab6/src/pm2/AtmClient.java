/* 1748022 ������
 * (�ǽ�2) ���� ���� �ý���
 * */

package pm2;

import java.util.Scanner;

public class AtmClient {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount();
		
		boolean ctn = true;
		while (ctn) {
			
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1. ���� ���� ���   2. ���� ����   3. ���� �Ա�");
			System.out.println("(�������� 0�� �Է��ϼ���)");
			try {
			int input = sc.nextInt();
			
			switch (input) {
			case 0: ctn = false; continue;
			
			case 1: System.out.println("�ܾ�: "+account.getBalance()); break;
			
			case 2: System.out.println("�� �����Ͻðڽ��ϱ�?");
				int withdraw = sc.nextInt();
				
				if (withdraw > account.getBalance()) 
					throw new NotEnoughMoneyException("NotEnoughMoneyException : !! �ܾ��� ������� �ʽ��ϴ�.");
				if (withdraw < 0) 
					throw new InvalidMoneyException ("InvalidMoneyException : !! �Ա� �׼��� �� �� �Ǿ����ϴ�.");
				
				account.setBalance(account.getBalance() - withdraw);
				System.out.println("���� �ܾ�: "+account.getBalance());
				break;
			case 3: 
				System.out.println("�� �Ա��Ͻðڽ��ϱ�?");
				int deposit = sc.nextInt();
				if (deposit < 0) 
					throw new InvalidMoneyException ("InvalidMoneyException : !! �Ա� �׼��� �� �� �Ǿ����ϴ�.");
				
				account.setBalance(account.getBalance()+deposit);
				System.out.println("���� �ܾ�: "+account.getBalance());
				break;
			} //end of switch
			
			} //end of try
			
			catch (NotEnoughMoneyException e) {
				System.out.println(e.getMessage());
				System.out.println("���� �ܾ�: "+account.getBalance());
			}
			
			catch (InvalidMoneyException e) {
				System.out.println(e.getMessage());
				System.out.println("���� �ܾ�: "+account.getBalance());
			}
			

		}//end of while
		System.out.println("���α׷� ����.");
		
	}//end of main

}
