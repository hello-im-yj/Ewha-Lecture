/* 1748022 김유진
 * (실습2) 스택구현
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
