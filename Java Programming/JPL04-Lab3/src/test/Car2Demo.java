/* 1748022 ������
 * this, this() ���
 * */

package test;

public class Car2Demo {
	
	public static void main (String args[]) {
		
		Car2 car1 = new Car2();
		System.out.println("car1 feilds");
		car1.printAllFeild();
		System.out.println();
		
		Car2 car2 = new Car2("�ڰ���");
		System.out.println("car2 feilds");
		car2.printAllFeild();
		System.out.println();
		
		Car2 car3 = new Car2("�ڰ���", "����");
		System.out.println("car3 feilds");
		car3.printAllFeild();
		System.out.println();
		
		Car2 car4 = new Car2("�ý�", "����", 200);
		System.out.println("car4 feilds");
		car4.printAllFeild();
		System.out.println();
		
	}
}
