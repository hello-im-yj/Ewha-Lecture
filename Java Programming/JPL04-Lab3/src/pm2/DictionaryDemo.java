/* 1748022 김유진
 * (실습2) 한영사전
 * */

package pm2;

import java.util.Scanner;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Dictionary dc = new Dictionary();
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while (true) {
			System.out.print("한글 단어?");
			String input = sc.nextLine();
			if (input.equals("그만") ) break;
			String engWord = dc.korToEngWord(input);
			if (engWord != null) System.out.println(input+"은 "+engWord);
		}

	}

}
