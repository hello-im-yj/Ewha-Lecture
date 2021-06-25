/* 1748022 김유진
 * (실습1) 도형 면적/둘레 구하기
 * */

package Pm1;

public class Triangle implements Geometry  {
	
	double a,b,c;
	
	Triangle() {
		
	}
	
	Triangle (double a, double b, double c) {
		this.a=a; this.b=b; this.c=c;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double s = (a+b+c)/2.0; //? 메소드 밖에다 (필드 구역에다) 놓으면 왜 -0.0이 출력될까> ?
		//필드 먼저 만들어지고 거기 안에 a,b,c값이 들어가는 것이기 때문.(생성자 먼저 실행되는것아님.. 대입연산이자나!!) 
		//필드에다 선언하면 기존에 0으로 초기화됐던 a,b,c값이 계산되어서 0값이 저장되게 됨. 
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
