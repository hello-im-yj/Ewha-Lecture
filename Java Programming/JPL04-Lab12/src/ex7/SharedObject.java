/* 1748022 ������
 * (����7) volatile �׽�Ʈ
 * */

package ex7;

public class SharedObject {
	
	public volatile int MY_INT =0;

	// public int MY_INT =0; (volatile Ű���带 ���� ���� ��� )
	/*Incrementing MY_INT to 1
	Incrementing MY_INT to 2
	Incrementing MY_INT to 3
	Incrementing MY_INT to 4
	Incrementing MY_INT to 5*/ 
	//���� ���� ���� ��� ��. -> �޸𸮿��� �о���� �ʰ� ĳ�ÿ��� �о���� ����...!
	//�׷��� sharedObj.MY_INT ���� ��� 0���� �νĵ�.


}
