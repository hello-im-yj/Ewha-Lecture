/* 1748022 ������
 * this, this() ���
 * */

package test;

public class Car2 {
	
	public String company ="�����ڵ���";
	public String model;
	public String color;
	public int maxSpeed;
	
	public Car2() {
		this.model = "not model defined";
		this.color = "not color defined";
		maxSpeed = 100;
	}
	
	//�ٸ� ������ ȣ��!!!
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
