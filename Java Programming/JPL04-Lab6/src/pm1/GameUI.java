package pm1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameUI {

	public static void main (String args[]) {
		
		//Character[] chArr = new Character[100]
		Character myChar;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("캐릭터를 선택하세요.");
			System.out.println("1.성직자 2.궁수 3.마법사 4.기사");
			
			try {
				int selected = sc.nextInt();
			switch (selected) {
			case 1: myChar = new Monk("Monk"); break;
			case 2: myChar = new Archer("Archer"); break;
			case 3: myChar = new Wizard("Wizard"); break; 
			case 4: myChar = new Knight("Knight"); break;
			default : System.out.println("다시 입력하세요!"); continue;
			}//end of switch 
			
			myChar.apppendCharacter();
			myChar.characterSkill();
			System.out.println(Character.selectedCharacter);
			
			boolean end = false;
			while(true) {
				System.out.println("캐릭터를 변경하시겠습니까?");
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
				System.out.println("숫자를 입력하세요."); continue;
			}

		}//end of while
		
		System.out.println("게임을 종료했습니다.");
		
		
	}// end of main

}
