/* 1748022 ������
 * (�ǽ�1) ����ó��
 * */

package pm1;

public class Grade {
	
	private int math;
	private int sci;
	private int eng;
	
	public Grade(int math,int sci, int eng) {
		this.math = math;
		this.sci = sci;
		this.eng = eng;
	}
	
	public int average() {
		
		return (math+sci+eng)/3;
		
	}

}
