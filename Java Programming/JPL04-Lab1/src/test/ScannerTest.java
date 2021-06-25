package test;

import java.util.*;


public class ScannerTest {

	public static void main (String args[]) {
		
		System.out.println("이름, 주소, 나이, 몸무게를 공백으로 구분하여 차례로 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); //빈칸까지 읽어옴, nextLine()은 /n을 포함한 라인 전체를 읽어옴.
		String addr = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		
		System.out.println("이름: " + name + " 주소:" + addr + " 나이:" + age + " 몸무게: " + weight);
		
	}
		
}
