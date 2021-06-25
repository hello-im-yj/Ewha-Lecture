/* 1748022 김유진
 * (예제7) volatile 테스트
 * */

package ex7;

public class SharedObject {
	
	public volatile int MY_INT =0;

	// public int MY_INT =0; (volatile 키워드를 쓰지 않을 경우 )
	/*Incrementing MY_INT to 1
	Incrementing MY_INT to 2
	Incrementing MY_INT to 3
	Incrementing MY_INT to 4
	Incrementing MY_INT to 5*/ 
	//위와 같이 값이 출력 됨. -> 메모리에서 읽어오지 않고 캐시에서 읽어오기 때문...!
	//그래서 sharedObj.MY_INT 값이 계속 0으로 인식됨.


}
