/* 1748022 김유진
 * (실습2) 스택구현
 * */

package pm2;

public class StringStack implements Stack {
	
	private int stackSize;
	private Object[] sArr ;
	private int numofStack=0;
	
	public StringStack(int stackSize) {
		this.stackSize = stackSize;
		sArr = new Object[stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (numofStack == 0) return true;
		else return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (numofStack == stackSize ) return true;
		else return false;
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		sArr[numofStack] = item;
		numofStack++;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		numofStack--;
		//String pop = (String)sArr[numofStack];
		Object pop = sArr[numofStack];
		sArr[numofStack] = null;
		return pop; //리턴타입이 object인데 String type을 리턴해도 됨? 알아서 자동 업캐스팅 되려나...
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return sArr[numofStack];
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (int i=0; i<stackSize ;i++) {
			sArr[i]=null;
			
		} numofStack = 0;
		
		System.out.println("Stack is clear!");
		if(isEmpty()) System.out.println("Stack is Empty."); 
	}

	public void printStack() {
		
		for (int i = 0; i<numofStack ; i++) { //여기를 stackSize만큼 돌리면 null이 출력돼서 안됨.
			System.out.print(sArr[i] + " ");
		}
		
	}

}
