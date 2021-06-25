/* 1748022 ±èÀ¯Áø
 * static ¸â¹ö
 * */

package test;

public class CountHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountHandle.clsCount++;
		CountHandle obj1 = new CountHandle();
		obj1.instCount++;
		obj1.printCount();
		
		CountHandle.clsCount++;
		CountHandle obj2 = new CountHandle();
		obj2.instCount++;
		obj2.printCount();
		
		CountHandle.clsCount++;
		CountHandle obj3 = new CountHandle();
		obj3.instCount++;
		obj3.printCount();

	}

}
