/* 1748022 ������
 * (����7) HashMap
 * */
package ex7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

	public static void main (String args[]) {
		
		HashMap<String,String> loginData = new HashMap<String,String> ();
		
		loginData.put("89123", "��¿�");
		loginData.put("04123","������");
		loginData.put("13323", "������");
		
		Scanner sc = new Scanner(System.in);
		String id =sc.next();
		String name = sc.next();
		
		//���̵� �������� ���� ��
		if(!loginData.containsKey(id)) { 
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return; //main�Լ� ����!exit���� ����.
		}
		
		//���̵�� �̸��� ��ġ���� ���� ��
		String val = loginData.get(id); //key������ ȣ��! index�� ���� ������.
		if (!val.equals(name)) {
			System.out.println("�ùٸ� ����ڰ� �ƴմϴ�.");
			return; //main�Լ� ����!exit���� ����.
		}
		
		System.out.println("�α��� �Ϸ�");
		
	}
}
