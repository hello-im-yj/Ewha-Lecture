/* 1748022 김유진
 * (예제5) Tv클래스
 * */

package ex5;

public class Tv {
	
	private int size;
	private String manufacture;
	public Tv(int size,String manufacture) {
		this.size = size;
		this.manufacture = manufacture;
		System.out.println(size + "인치"+manufacture);
	}
	
	public Tv(String manufacture) {
		this(32,manufacture);
	}
	
	public Tv() {
		this(32,"LG");
	}

}
