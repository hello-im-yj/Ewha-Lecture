/* 1748022 ������
 * (�ǽ�3) ��������(3/3)
 * */

package pm3;

import java.util.Scanner;

public class SongMarketWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input User >> ");
		Scanner sc = new Scanner(System.in);
		String userId = sc.next();
		CartForSongs cart = new CartForSongs(userId);
		
		System.out.println("start Shopping - Cart of "+cart.getUserId());
		while (true) {
			System.out.println("Input Song Information (title singer price)");
			String title = sc.next();
			if (title.equals("�׸�")) break;
			String singer = sc.next();
			if (singer.equals("0")) singer ="�͸�"; 
			Double price = sc.nextDouble();
			if (price == 0) price = 10.0;
			
			Song s = new Song(title,singer,price);
						
			System.out.println("Input slae Mode(NonDiscount(0) or Onsale(1) ro TodayEvent(2)");
			s.setMode(sc.nextInt());
			
			cart.addsong(s);
			
		}
		cart.calculateTotalPrice();
		System.out.println("Total Price("+cart.getUserId()+"): "+Song.totalPrice);

	}

}
