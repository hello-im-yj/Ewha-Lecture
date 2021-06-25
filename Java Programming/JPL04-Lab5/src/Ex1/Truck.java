/* 1748022 김유진
 * (예제1) 추상클래스
 * */

package Ex1;

public class Truck extends Car {
	//처음에 extends를 쓰면 Car class에 인자가 없는 default 생성자가 없기 때문에 오류
	//하지만 생성자 정의해주면서 super에도 적절한 인자를 넣어주면 오류 없어짐!
	
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
