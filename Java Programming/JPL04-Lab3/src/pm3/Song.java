/* 1748022 ������
 * (�ǽ�3) ��������(1/3)
 * */

package pm3;

public class Song {
	
	static int totalPrice =0;
	private int mode;
			//new String[] {"NonDiscounted","OnSale","TodayEvent"};
	private String title;
	private String singer;
	private double price;
	
	
	
	public Song(String title, String singer, double price) {
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	
	public Song(String title, double price) {
		this(title,"�͸�",price);
	}
	
	public Song(String title, String singer) {
		this(title,singer,10.0);
	}
	
	public Song(String title) {
		this(title,"�͸�",10.0);
	}
	

	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public double getPrice() {
		return price;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getMode() {
		return mode;
	}

	
	

	

}
