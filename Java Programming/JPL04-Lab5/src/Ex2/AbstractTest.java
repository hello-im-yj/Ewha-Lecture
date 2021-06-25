/* 1748022 김유진
 * (예제2) 추상클래스
 * */

package Ex2;

public class AbstractTest {
//다형성 테스트
	
	public static void main (String args[]) {
		
		 Car car = new Car();
		 Ship ship = new Ship();
		 Plane plane = new Plane();
		 VehicleUse vUse= new VehicleUse();
		 
		 vUse.getMoveStyle(car);
		 vUse.getMoveStyle(ship);
		 vUse.getMoveStyle(plane);
	}
}
