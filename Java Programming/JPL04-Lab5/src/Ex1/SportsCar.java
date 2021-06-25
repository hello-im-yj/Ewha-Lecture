/* 1748022 김유진
 * (예제1) 추상클래스
 * */

package Ex1;

public class SportsCar extends Car {
	
	public SportsCar (String carName) {
		super(carName);
	}
	
	public void speedUp (int step) {
		velocity += (step*20);
	}
	
	public void speedDown(int step) {
		velocity -= (step*10);
		
		if (velocity <0) velocity=0;
	}

}
