/* 1748022 ������
 * (�ǽ�2) ���ñ���
 * */

package pm2;
//solution Ȯ���غ���!!@ 

public class StackDemo {
	
	public static void main (String args[]) {
		
		int stackSize = 5;
		StringStack arrStack = new StringStack(stackSize);
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		if(arrStack.isFull()) {
			System.out.println("It's Full!!!");
			String s = (String)arrStack.pop();
			System.out.println("pop ��ȯ�� : "+s);
			arrStack.clear();
		}
		System.out.println();
		
		arrStack.push("Ewha");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("Womans");
		arrStack.printStack();
		System.out.println();
		
		arrStack.push("University");
		arrStack.printStack();
		System.out.println();
		
		arrStack.pop();
		arrStack.printStack();
		System.out.println();
		
		arrStack.pop();
		arrStack.printStack();
		System.out.println();
		
		arrStack.peek();
		arrStack.printStack();
		System.out.println();
		
		arrStack.clear();
		arrStack.printStack();
		
	}
}
