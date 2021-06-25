/* 1748022 ������
 * (����1) �߻�Ŭ����
 * */

package Ex1;

public class Truck extends Car {
	//ó���� extends�� ���� Car class�� ���ڰ� ���� default �����ڰ� ���� ������ ����
	//������ ������ �������ָ鼭 super���� ������ ���ڸ� �־��ָ� ���� ������!
	
	public Truck (int wheelNum, String carName) {
		super(wheelNum,carName);
	}
	
	public Truck (String carName) {
		super(carName);
	}
	
	public void speedUp(int step) {
		velocity += (step*20);
		
		if (velocity > 100) {
			velocity = 100;
		}
	}
	
	public void speedDown(int step) {
		velocity -= (step*5) ;
		
		if (velocity <0) {
			velocity = 0;
		}
	}
	
	public String toString() {
		String str = "This truck is " + carName + "." ;
		return str;
	}

}
