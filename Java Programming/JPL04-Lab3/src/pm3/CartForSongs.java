/* 1748022 김유진
 * (실습3) 음원구매(2/3)
 * */

package pm3;

public class CartForSongs {
	
	static final int MAXCOUNT =100;
	private String userId; 

	public CartForSongs(String userId) {
		this.userId = userId;
	}
	
	private Song[] songCart = new Song[MAXCOUNT] ;
	private int songCnt=0; 
	
	public String getUserId() {
		return userId;
	}


	public int getSongCnt() {
		return songCnt;
	}

	public void calculateTotalPrice(){
		
		for (int i=0;i<songCnt; i++) {
			switch (songCart[i].getMode()) {
			case 0 : Song.totalPrice += songCart[i].getPrice();
				break;
			case 1 : Song.totalPrice += songCart[i].getPrice()*0.9;
				break;
			case 2 : Song.totalPrice += songCart[i].getPrice()*0.7;
				break;
			}
		}
		
	}
	
	public void addsong(Song s) {
		songCart[songCnt]=s;
		songCnt++;
	}
	

}
