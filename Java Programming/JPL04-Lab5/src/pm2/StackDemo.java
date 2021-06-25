/* 1748022 김유진
 * (실습2) 스택구현
 * */

package pm2;
//solution 확인해보기!!@ 

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
			System.out.println("pop 반환값 : "+s);
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
