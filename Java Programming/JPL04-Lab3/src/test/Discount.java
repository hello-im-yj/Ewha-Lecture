/* 1748022 김유진
 * static 사용
 * */
package test;

public class Discount {
	public static int month;
	public static int count;
	
	public int price;
	public double dcRate;
	public int dcPrice;
	
	public static void title() {
		System.out.println("***"+ month+"월 고객 감사 할인 행사***\n");
	}
	
	public void doCall() {
		dcPrice = (int)(price-price*dcRate);
		System.out.println("정가는 "+price+"원 입니다.");
		System.out.println("할인가는" + dcPrice+"원 입니다.");
		
		count++;
	}

}
