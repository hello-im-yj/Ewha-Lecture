/* 1748022 ������
 * (�ǽ�2) ���ñ���
 * */

package pm2;

public interface Stack {
	
	boolean isEmpty();
	boolean isFull();
	void push(Object item);
	Object pop();
	Object peek();
	void clear();
	
}
