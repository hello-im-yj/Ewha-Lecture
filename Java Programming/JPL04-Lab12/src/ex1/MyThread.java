/* 1748022 ������
 * (����1) ������ �����
 * */

package ex1;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1;i<=10;i++) {
			sum += i;
			System.out.println(i+"���ϱ� ���: "+sum);
		}
		
		System.out.println("-----------------");
		System.out.println("1~10 ���ϱ�: "+sum);
	}
	
	

}
