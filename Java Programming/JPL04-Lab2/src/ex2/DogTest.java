/* 1748022 ±èÀ¯Áø
 * 
 * */

package ex2;

public class DogTest {
	
	public static void main (String[] args) {
		Dog d = new Dog();
		d.setSize(30);
		d.bark(3);
		d.setSize(0);
		d.bark(3);
		d.setSize(15);
		d.bark(3);
		
		System.out.println("Dog one : " +d.getSize());
	}

}
