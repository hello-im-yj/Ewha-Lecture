/* 1748022 ������
 * (����1) final Modifier
 * */

package ex1;

public class MySoftDemo {
	
	public static void main (String args[]) {
		MySoft ms1 = new MySoft();
		MySoft ms2 = new MySoft();
		
		ms1.setSoftName("�������α׷�");
		ms1.setSoftCost(200000);
		
		ms2.setSoftName("�������α׷�");
		ms2.setSoftCost(300000);
		
		System.out.println("ms1: "+ms1.getSoftName()+" ms1: "+ms1.getSoftCost());
		System.out.println("ms2: "+ms2.getSoftName()+" ms2: "+ms2.getSoftCost());
		
		System.out.println("total: "+MySoft.softTotal);
		
	}

}
