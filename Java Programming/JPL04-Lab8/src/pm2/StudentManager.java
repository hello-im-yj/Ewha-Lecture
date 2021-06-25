/* 1748022 ������
 * (�ǽ�2) �л� ���� �����ϰ� �˻��ϱ�
 * */

package pm2;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {
	
	public static void main (String args[]) {
		
		HashMap<String,SchoolInfo> student = new HashMap<String,SchoolInfo>();
		Scanner sin = new Scanner(System.in);
		System.out.println("�̸� �а� �й������� �л� 5���� ������ �Է��ϼ���.");
		
		for (int i=0;i<5;i++) {
			String name = sin.next();
			String dept = sin.next();
			String schoolID = sin.nextLine();
			SchoolInfo si = new SchoolInfo(dept,schoolID);
			student.put(name,si);
		}
		
		while (true) {
			System.out.println("�˻��� �л� �̸��� �Է��Ͻÿ�. �������� �̸��� '��'�̶�� �Է��Ͻÿ�.");
			String key = sin.nextLine();
			if (key.equals("��")) break;
			if (student.containsKey(key)) {
				System.out.println( key +">> "+student.get(key).getDept()+" , "+student.get(key).getSchoolID());
			}
			else {
				System.out.println("�л��� �������� �ʽ��ϴ�.");
			}
			
		}
		System.out.println("�ȳ�!");
	}

}
