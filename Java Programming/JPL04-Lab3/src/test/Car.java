/* 1748022 ������
 * ������ �����ε�
 * */

package test;

public class Car {
	
	public String company ="�����ڵ���";
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
