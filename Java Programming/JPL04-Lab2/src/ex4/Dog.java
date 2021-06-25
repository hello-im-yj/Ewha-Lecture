/* 1748022 辫蜡柳
 * 
 * */

package ex4;

public class Dog {
	
	//抗力3 Class
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
		System.out.println("港! 港! 港!");
	}

	public void run() {
		System.out.println(name + " is running" );
	}
	
	//眠啊
	public void tryToReplace(Dog otherDog) {
		System.out.println("\n === tryToReplace() Start === ");
		System.out.println("       Before Assign : otherDog run ");
		otherDog.run();
		
		otherDog = this;
		System.out.println("       After Assign : otherDog run ");
		otherDog.run();
		System.out.println("\n === tryToReplace() end === ");
		
		
	}
	
	public void tryToChange(int intSize) {
		System.out.println("\n === tryToChange() Start === ");
		System.out.println("       Before Assign : intSize value?" + intSize);
		intSize = this.size;
		System.out.println("       After Assign : intSize value?" + intSize);
		System.out.println("\n === tryToChange() end === ");
	}


}
