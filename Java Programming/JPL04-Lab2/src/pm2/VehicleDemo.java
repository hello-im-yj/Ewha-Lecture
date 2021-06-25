/* 1748022 김유진
 * (실습2) 차량 연비 관리
 * */

package pm2;

public class VehicleDemo {
	
	public static void main (String args[]) {
		
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		System.out.println("미니밴은 252 마일을 가기 위해 "+minivan.fuelneeded(252)+"갤런의 연료가 필요하다.");
		System.out.println("스포츠카는 252 마일을 가기 위해 "+sportscar.fuelneeded(252)+"갤런의 연료가 필요하다.");
		
		System.out.println("미니밴은 현재 "+minivan.range()+"마일을 주행할 수 있다.");
		System.out.println("스포츠카는 현재 "+sportscar.range()+"마일을 주행할 수 있다.");
	}

}
