/* 1748022 ������
 * ����ó�� (throws/throw)
 * */

package Ex2;

import java.util.Scanner;

public class ExceptionTest4 {
	
	public int inputData () throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100������ ���� �Է��ϼ���!");
		int val = sc.nextInt();
		if(val<1 || val>100) {
			throw new Exception();
		}
		
		return val;
	}
	//throws Test
	public static void main (String[] agrs) {
		ExceptionTest4 et = new ExceptionTest4();
		try {
			int val = et.inputData();
			System.out.println("�Է°�: "+val);
		}
		catch (Exception e){
			System.out.println("�Է°��� ������ ������ϴ�. ");
		}
		
	}

}
