/* 1748022 ������
 * (����2) �߻�Ŭ����
 * */

package Ex2;

public class AbstractTest {
//������ �׽�Ʈ
	
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
