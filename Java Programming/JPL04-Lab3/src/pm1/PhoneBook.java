/* 1748022 김유진
 * (실습1) 전화번호부
 * */


package pm1;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 >> ");
		int n = sc.nextInt();
		
		Phone[] pb = new Phone[n];
		
		for (int i=0;i<pb.length;i++)
		{	
			System.out.println("이름과 전화번호 >> ");
			String name = sc.next();
			String phoneNum = sc.next();
			pb[i] = new Phone(name, phoneNum);
			
		}
		
		while (true) {
			
			//for (int i=0;i<pb.length;i++) {
				//System.out.println(pb[i].getPhoneNum());
			//}
			System.out.println("검색할 이름 >> ");
			String search = sc.next();
			if (search.equals("그만")) break;
			
			boolean none = true;
			for (int i=0;i<pb.length;i++) {
				if (pb[i].isYourName(search) == true) { none = false;
					System.out.println(search+"전화번호: "+pb[i].getPhoneNum());}				
			}
			if (none == true) System.out.println(search+"이/가 없습니다.");
			
			
		}

	}

}
