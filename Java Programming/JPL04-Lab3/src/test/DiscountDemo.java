/* 1748022 김유진
 * static 사용
 * */
package test;

public class DiscountDemo {
	
	public static void main (String args[]) {
		Discount.month = 12;
		Discount.title();
		
		Discount cal1 = new Discount();
		cal1.price = 20000;
		cal1.dcRate = 0.2;
		cal1.doCall();
		
		//static은 객체생성 없이 class명으로 접근.(객체명X)
		
		System.out.println("귀하는" + Discount.count +"번째 손님입니다.\n");
		
		Discount cal2 = new Discount();
		cal2.price = 10000;
		cal2.dcRate = 0.1;
		cal2.doCall();
		
		System.out.println("귀하는" + Discount.count +"번째 손님입니다.\n");
		
		
	}

}
