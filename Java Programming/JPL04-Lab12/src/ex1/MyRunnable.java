/* 1748022 ������
 * (����1) ������ �����
 * */

package ex1;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int multiply =1;
		for (int i=1;i<=10;i++) {
			multiply *= i;
			System.out.println(i+"���ϱ� ���: "+multiply);
		}
		
		System.out.println("-----------------");
		System.out.println("1~10 ���ϱ�: "+multiply);
	}
	
	

}
