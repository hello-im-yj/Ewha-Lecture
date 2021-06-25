// 1748022 김유진
// (예제1) Scanner 사용 : 이름, 도시, 나이, 체중, 독립 여부를 입력받고 다시 출력하는 프로그램.

package ex1;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main (String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		//엔터치면 값 전송. 처음 들어간 값부터 읽어들임.
		String name = scanner.next();
		System.out.print("이름은 "+name+",");

		String city = scanner.next();
		System.out.print("도시는 "+city+",");
		//next~Type~()메서드는 next와 같이 space로 구분.
		//주의 nextInt 담에 nextLine()쓰면 엔터치는 순간 nextLine까지 같이 넘어감, int에서는 값만 가져가고 엔터가 남았기때문!(아무것도 입력 안된 상태로 nextLine에 들어감)
		//이럴땐 nextLine으로 통일하고 래퍼클래스.parseInt로 변환해주는게 에러 확률 낮음.
		int age = scanner.nextInt();
		System.out.print("나이는 "+age+"살,");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 "+weight+"kg,");
		
		boolean single = scanner.nextBoolean();
		System.out.print("독신 여부는 " + single +"입니다.");

	}

}
