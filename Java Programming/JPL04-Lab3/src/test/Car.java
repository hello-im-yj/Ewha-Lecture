/* 1748022 김유진
 * 생성자 오버로딩
 * */

package test;

public class Car {
	
	public String company ="현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	public Car() {}
	
	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model =model;
		this.color=color;
	}

	public Car(String model, String color, int maxSpeed) {
		//super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void printAllFeild() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	
	
}
