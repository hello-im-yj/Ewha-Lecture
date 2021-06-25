/* 1748022 김유진
 * this, this() 사용
 * */

package test;

public class Car2 {
	
	public String company ="현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	public Car2() {
		this.model = "not model defined";
		this.color = "not color defined";
		maxSpeed = 100;
	}
	
	//다른 생성자 호출!!!
	public Car2(String model) {
		this(model,"not color defined",100);
	}

	public Car2 (String model, String color) {
		this(model,color,100);
	}

	public Car2 (String model, String color, int maxSpeed) {
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
