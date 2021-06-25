/* 1748022 김유진
 * 
 * */
package ex3;

//getter-setter 는 마우스 오른쪽버튼 - source - generate Getter and Setters에서 자동 생성 가능

public class Dog {
	
	private int size;
	private String name;
	
	public String getName() {
		return name;
	}	

	public void setName(String name) {
		this.name = name;
	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >10) this.size = size;
	}
	
	public void bark() {
		System.out.println("멍! 멍! 멍!");
	}

	public void run() {
		System.out.println(name + " is running" );
	}

}
