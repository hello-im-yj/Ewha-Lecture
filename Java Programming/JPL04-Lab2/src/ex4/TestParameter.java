/* 1748022 ������
 * 
 * */

package ex4;

public class TestParameter {
	
	public static void main (String args[]) {
		
		int intSize = 50;
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.setName("Happy");
		d1.setSize(25);
		
		d1.tryToChange(intSize);
		System.out.println("\n === tryToChange Retult In main ==="); //call by value �Լ�
		System.out.println("       intSize value? "+intSize); 
		// ���� ����Ǳ� ������ main���� ���ƿ��� ������.
		
		d1.tryToReplace(d2);
		System.out.println("\n === tryToReplace Retult In main ==="); 
		System.out.println("       d1 run() ===> ");
		d1.run();
		System.out.println("       d2 run() ===> ");
		d2.run(); //null ���. d2�� �żҵ� �ȿ����� �ٲ�� main������ �ٲ��� ���� 
		//-> �ڹٴ� call by reference�� �ƴ� ��ü ��ü�� ����ȴٰ� �����ϴ°� ����. 
		//�Ű������� stack�� ����Ǳ� ������ stack�� ������ ���� X
	}

}
