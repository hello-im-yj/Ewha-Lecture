/* 1748022 김유진
 * 상속 관계에 있는 클래스간 멤버 접근
 * */

package test;

public class Person {
	
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

}
