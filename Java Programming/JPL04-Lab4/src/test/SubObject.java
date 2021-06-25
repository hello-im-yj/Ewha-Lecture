/* 1748022 김유진
 * super/super()
 * */

package test;

public class SubObject extends SuperObject {
	
	protected String name;
	public SubObject() {
		super();
		System.out.println("생성자 SubObject()");
	}
	
	public SubObject(int m) {
		this();
		System.out.println("생성자 SubObject(int m) >> m is " + m);
	}
	
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}

}
