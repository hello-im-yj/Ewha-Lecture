/* 1748022 ������
 * super/super()
 * */

package test;

public class SuperObject {
	
	protected String name;
	
	public SuperObject() {
		System.out.println("������ SuperObject()");
	}
	
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}

}
