/* 1748022 ������
 * (����5) TvŬ����
 * */

package ex5;

public class Tv {
	
	private int size;
	private String manufacture;
	public Tv(int size,String manufacture) {
		this.size = size;
		this.manufacture = manufacture;
		System.out.println(size + "��ġ"+manufacture);
	}
	
	public Tv(String manufacture) {
		this(32,manufacture);
	}
	
	public Tv() {
		this(32,"LG");
	}

}
