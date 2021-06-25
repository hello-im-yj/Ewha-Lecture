/* 1748022 ±èÀ¯Áø
 * 
 * */
package ex1;

public class Dog {
	
	public int size;
	public String name;
	
	public void bark(int numOfBarks) {
		
		for (int i = 0; i <numOfBarks; i++) {
			if(size>40) System.out.print("¿Õ");
			else if (size>20) System.out.print("¸Û");
			else System.out.print("¿ù");
		}
		
		System.out.println();
		
	}
	
	public void run() {
		
		System.out.println(name + "is running");
		
	}

}
