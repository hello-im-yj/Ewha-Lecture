/* 1748022 ������
 * (�ǽ�1) ��ȭ��ȣ��
 * */


package pm1;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο��� >> ");
		int n = sc.nextInt();
		
		Phone[] pb = new Phone[n];
		
		for (int i=0;i<pb.length;i++)
		{	
			System.out.println("�̸��� ��ȭ��ȣ >> ");
			String name = sc.next();
			String phoneNum = sc.next();
			pb[i] = new Phone(name, phoneNum);
			
		}
		
		while (true) {
			
			//for (int i=0;i<pb.length;i++) {
				//System.out.println(pb[i].getPhoneNum());
			//}
			System.out.println("�˻��� �̸� >> ");
			String search = sc.next();
			if (search.equals("�׸�")) break;
			
			boolean none = true;
			for (int i=0;i<pb.length;i++) {
				if (pb[i].isYourName(search) == true) { none = false;
					System.out.println(search+"��ȭ��ȣ: "+pb[i].getPhoneNum());}				
			}
			if (none == true) System.out.println(search+"��/�� �����ϴ�.");
			
			
		}

	}

}
