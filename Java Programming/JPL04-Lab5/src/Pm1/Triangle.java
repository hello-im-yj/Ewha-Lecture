/* 1748022 ������
 * (�ǽ�1) ���� ����/�ѷ� ���ϱ�
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
		double s = (a+b+c)/2.0; //? �޼ҵ� �ۿ��� (�ʵ� ��������) ������ �� -0.0�� ��µɱ�> ?
		//�ʵ� ���� ��������� �ű� �ȿ� a,b,c���� ���� ���̱� ����.(������ ���� ����Ǵ°;ƴ�.. ���Կ������ڳ�!!) 
		//�ʵ忡�� �����ϸ� ������ 0���� �ʱ�ȭ�ƴ� a,b,c���� ���Ǿ 0���� ����ǰ� ��. 
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
