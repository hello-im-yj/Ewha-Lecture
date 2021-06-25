/* 1748022 김유진
 * (실습1) 도형 면적/둘레 구하기
 * */

package Pm1;

public class Square implements Geometry {
	
	Double side;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	
	

}
