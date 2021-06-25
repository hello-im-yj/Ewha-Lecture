/* 1748022 김유진
 * (실습2) 차량 연비 관리
 * */

package pm2;

public class Vehicle {
	
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	public Vehicle (int p, int f, int m) {
		this.passengers = p;
		this.fuelcap = f;
		this.mpg = m;
	}
	
	public double fuelneeded(int miles) {
		return miles/fuelcap;		
	}
	
	public int range() {
		return mpg*fuelcap;		
	}

}
