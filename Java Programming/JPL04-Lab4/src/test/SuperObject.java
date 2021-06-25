/* 1748022 김유진
 * super/super()
 * */

package test;

public class SuperObject {
	
	protected String name;
	
	public SuperObject() {
		System.out.println("생성자 SuperObject()");
	}
	
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}

}
