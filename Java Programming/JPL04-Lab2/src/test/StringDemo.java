/* 1748022 ������
 * 
 * */

package test;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "abcdef";
		String str4 = new String ("abcdef");
		
		int n = 3;
		
		/* 
		String type�� str3ó�� �����ص� �ǰ�, str4ó�� �����ص� ��. �� �� �Ȱ��� process�� ��ü�����ϰ� ��. 
		str�� ���� ���Ǵ� Ŭ������ ������ new�� �������� �ʾƵ� �ڵ����� �������!
		*/
		
		if (str1.equals(str2))
			System.out.println("str1 ���ڿ��� str2 ���ڿ��� ����.");
		else 
			System.out.println("str1 ���ڿ��� str2 ���ڿ��� �ٸ���.");
		
		if (str1.equals(str3))
			System.out.println("str1 ���ڿ��� str3 ���ڿ��� ����. ");
		else
			System.out.println("str1 ���ڿ��� str3 ���ڿ��� �ٸ���. ");
		
		if (str3.contains(str1))
			System.out.println("str3 ���ڿ��� str1 ���ڿ��� �����Ѵ�. ");
		else 
			System.out.println("str3 ���ڿ��� str1 ���ڿ��� �������� �ʴ´�. ");
		
		if (str4.contains(str1))
			System.out.println("str4 ���ڿ��� str1 ���ڿ��� �����Ѵ�.");
		else 
			System.out.println("str4 ���ڿ��� str1 ���ڿ��� �������� �ʴ´�. ");
		
		if (str1 == str2)
			System.out.println("�� �ּҰ� ����");
		else
			System.out.println("�� �ּҰ� �ٸ�");
		
		if (str3 == str4)
			System.out.println("�� �ּҰ� ����");
		else
			System.out.println("�� �ּҰ� �ٸ�");
		// str1,2,3�� ��� ���ͷ��̾ ���� �ƴ� �ٸ� ������ ����Ǳ� ������ �ٸ��ٰ� ���´�! 
		
		String str5 = str1;
		if (str1 == str5) 
			System.out.println("�� �ּҰ� ����");
		else 
			System.out.println("�� �ּҰ� �ٸ�");
		
	}

}
