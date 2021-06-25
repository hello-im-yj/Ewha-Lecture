/* 1748022 ������
 * super/super()
 * */

package test;

public class SubObject extends SuperObject {
	
	protected String name;
	public SubObject() {
		super();
		System.out.println("������ SubObject()");
	}
	
	public SubObject(int m) {
		this();
		System.out.println("������ SubObject(int m) >> m is " + m);
	}
	
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}

}
