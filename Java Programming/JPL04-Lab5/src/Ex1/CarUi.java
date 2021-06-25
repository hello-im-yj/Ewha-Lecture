/* 1748022 김유진
 * (예제1) 추상클래스
 * */

package Ex1;

public class CarUi {
	
	public static void printSpeed(Car obj) {
		
		if (obj instanceof Truck ) {
			System.out.println("Truck 현재속도 :" + obj.getVelocity());			
		}
		
		else if (obj instanceof SportsCar) {
			System.out.println("SportsCar 현재속도 :" + obj.getVelocity());	
		}
		
		else {
			System.out.println("차가 아닙니다.");
		}
		
	}
	
	public static void main (String args[]) {
		
		Car arrCar[] =new Car[3];
		arrCar[0] = new Truck (5,"lys-Volvo");
		arrCar[1] = new SportsCar ("lys-Ferrari");
		arrCar[2] = new SportsCar ("jam-Ferrari");
		
		for (int i = 0; i<arrCar.length; i++) {
			for (int j=0;j<10;j++) {
				arrCar[i].speedUp(j);
				System.out.println(arrCar[i].getVelocity());
			} printSpeed(arrCar[i]);		
		}
		
		for (int i = 0; i<arrCar.length;i++) {
			for (int j =0;j<5;j++) {
				arrCar[i].speedDown(j);
				System.out.println(arrCar[i].getVelocity());
			} printSpeed(arrCar[i]);
				
		}
		
		for (int i = 0; i<arrCar.length; i++) {
			System.out.println(i+":"+arrCar[i].toString());
		}		
		
	
	} //main

} //class
