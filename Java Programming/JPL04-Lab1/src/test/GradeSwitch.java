/* 1748022 ������
 * ���ǹ� switch ~ case Test 
 * */


package test;

public class GradeSwitch {
	
	public static void main (String args[]) {
		
/*		int a = 0;
		int b = 1;
		int c = 25;
		
		switch (c%2) {
		case 1 :
			
			break;
			
		case 2 :
			
			break;
		}
		
		char grade = 'A';
		
		switch (grade) {
			case 'A' :
				System.out.println("90~100�� �Դϴ�.");
				break;
			case 'B' :
				System.out.println("80~89�� �Դϴ�.");
				break;
			case 'C' :
				System.out.println("70~79�� �Դϴ�.");
				break;
				
*/
		
		
		String s = "�ƴϿ�"; //���ڿ��� ����
		switch (s) {
		case "��" :
			System.out.println("Yes");
			break;
			
		case "�ƴϿ�" :
			System.out.println("no");
			break;}

			
		char grade = 'A';
		
		switch (grade) {
			case 'A' :
			case 'B' :
				System.out.println("�� ���߽��ϴ�.");
				break;
			case 'C' :
			case 'D' :
				System.out.println("�� �� ����ϼ���.");
				break;
			case 'F' :
				System.out.println("���� �ϱ⿡ �ٽ� �����ϼ���.");
				break;
				
			default : 
				System.out.println("�߸��� �����Դϴ�.");
		}
	}
	
}
