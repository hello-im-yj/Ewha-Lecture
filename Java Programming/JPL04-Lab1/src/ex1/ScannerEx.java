// 1748022 ������
// (����1) Scanner ��� : �̸�, ����, ����, ü��, ���� ���θ� �Է¹ް� �ٽ� ����ϴ� ���α׷�.

package ex1;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main (String args[]) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		//����ġ�� �� ����. ó�� �� ������ �о����.
		String name = scanner.next();
		System.out.print("�̸��� "+name+",");

		String city = scanner.next();
		System.out.print("���ô� "+city+",");
		//next~Type~()�޼���� next�� ���� space�� ����.
		//���� nextInt �㿡 nextLine()���� ����ġ�� ���� nextLine���� ���� �Ѿ, int������ ���� �������� ���Ͱ� ���ұ⶧��!(�ƹ��͵� �Է� �ȵ� ���·� nextLine�� ��)
		//�̷��� nextLine���� �����ϰ� ����Ŭ����.parseInt�� ��ȯ���ִ°� ���� Ȯ�� ����.
		int age = scanner.nextInt();
		System.out.print("���̴� "+age+"��,");
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� "+weight+"kg,");
		
		boolean single = scanner.nextBoolean();
		System.out.print("���� ���δ� " + single +"�Դϴ�.");

	}

}
