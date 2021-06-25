package Round18;

enum MyData3{
	Sunday(0),Monday(1),Tuesday(2);

	private int position;
	private String msg;
	
	MyData3(int postion) {
		this.position = position;
		System.out.println(this);
	}
	
	int getPositon() {
		return position;
	}
	
}

public class EnumTest2 {
	
	public static void main  (String args[]) {
		
		MyData3 date = MyData3.Sunday;
		//()는 생략가능? 
		
	}

}
