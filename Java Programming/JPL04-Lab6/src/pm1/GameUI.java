package pm1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameUI {

	public static void main (String args[]) {
		
		//Character[] chArr = new Character[100]
		Character myChar;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("ĳ���͸� �����ϼ���.");
			System.out.println("1.������ 2.�ü� 3.������ 4.���");
			
			try {
				int selected = sc.nextInt();
			switch (selected) {
			case 1: myChar = new Monk("Monk"); break;
			case 2: myChar = new Archer("Archer"); break;
			case 3: myChar = new Wizard("Wizard"); break; 
			case 4: myChar = new Knight("Knight"); break;
			default : System.out.println("�ٽ� �Է��ϼ���!"); continue;
			}//end of switch 
			
			myChar.apppendCharacter();
			myChar.characterSkill();
			System.out.println(Character.selectedCharacter);
			
			boolean end = false;
			while(true) {
				System.out.println("ĳ���͸� �����Ͻðڽ��ϱ�?");
				String yorN = sc.next();
				if (yorN.equals("y") || yorN.equals("Y")) break;
				else if (yorN.equals("n") || yorN.equals("N")) {
					end = true;
					break;
				}
				else {continue;}
			}
				if (end == true) break;
			}	
			catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���."); continue;
			}

		}//end of while
		
		System.out.println("������ �����߽��ϴ�.");
		
		
	}// end of main

}
