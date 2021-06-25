/* 1748022 ������
 * (�ǽ�2) ���ñ���
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
		return pop; //����Ÿ���� object�ε� String type�� �����ص� ��? �˾Ƽ� �ڵ� ��ĳ���� �Ƿ���...
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
		
		for (int i = 0; i<numofStack ; i++) { //���⸦ stackSize��ŭ ������ null�� ��µż� �ȵ�.
			System.out.print(sArr[i] + " ");
		}
		
	}

}
