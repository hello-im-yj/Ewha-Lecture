/* 1748022 ±èÀ¯Áø
 * 
 * */
package ex2;

public class Dog {

	private int size;
	private String name;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size > 10)
			this.size = size;
	}

	public void bark(int numOfBarks) {
		for (int i = 0; i < numOfBarks; i++) {
			if (size > 40)
				System.out.print("¿Õ");
			else if (size > 20)
				System.out.print("¸Û");
			else
				System.out.print("¿ù");
		}
		System.out.println();
	}

}
