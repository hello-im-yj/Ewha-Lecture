/* 1748022 ������
 * (����6) Stack Ŭ����
 * */

package ex6;

import java.util.Stack;
import java.util.StringTokenizer;

public class StackDemo1 {
	
	public static void main (String args[]) {
		Stack<String> s = new Stack<String>();
		String d =  "{ } { ( ( { } ) ) { ( { ( ( ) ( ) ) } }" ;
		//"{1 }1 {2 (3 (4 {5 }5 )4 )3 {6 (7 {8 (9 (10 )10 (11 )11 )9 }8 }6"
		/* Stack�� ��ȣ��ã�⿡ ������ ����
		 * 1. ���� ������ ���߿� ���� => ��
		 * 2. ������ �־�� ���� -> �׷��� �ϴ� if�� ���� �����ź��� catch�ؼ� ����. -> �� �� ��!
		 * + ({)} �̷������� ��ȣ�� ���� �����ϴ� ��쵵 ����. 
		 */
		
		StringTokenizer dt = new StringTokenizer(d); //d���� string ���
		//StringTokenizer�� �������� �и�. �ٸ� ���� �������� �и��ϰ� ������ (String, "�и��ϰ��������");
		
		int check =0;
		while(dt.hasMoreTokens()) { //hasMoreElement�� ���� ���. �������̽� ���������� �Ѵ��س���.
			String a = dt.nextToken();
			
			// {�� (�϶�
			if(a.equals("{") || a.equals("(")) {
				s.push(a);
			}
			
			// }�� )�϶�
			else {
				//���ʰ�ȣ ¦ ����
				if (s.empty()==true) {
					check =1; break; //while�� ��������.
				}
				
				else {
					String b = s.pop();
					if (b.equals("{")&&a.equals("}") || b.equals("(") && b.equals(")")) ;
					else {
						check = 2; break;
					}
					
				}
			}//end of else
		}//end of while
		
		switch (check) {
		case 0: 
			//while�� �� �����µ� stack�� ������� ���� -> {,(�� ����. �����ʰ�ȣ ����(¦ �ȸ���)
			//��������� -> ¦����. 
			
			if(!s.empty()) {
				System.out.println("������ ��ȣ�� �����մϴ�.");
			}			
			else {
				System.out.println("���� �½��ϴ�.");
			}
			break;
			
		case 1: //���ʰ�ȣ ���� (¦ �ȸ���)
			System.out.println("���� ��ȣ�� �����մϴ�.");
			break;
		case 2: //���� ���� ����(���� ����)
			System.out.println("���� ���� �ʽ��ϴ�.");
			break;
		
		} //end of switch
		
	}//end of main

}
