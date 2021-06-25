/* 1748022 김유진
 * (예제8) 제너릭 클래스
 * */

package ex8;

public class MyClass<T> {
	
	T val;
	
	void set (T a) {
		val = a;
	}
	
	T get() {
		return val;
	}

}
