/* 1748022 김유진
 * (실습7) 음의 순서 판별
 * */

package pm7;

import java.util.Arrays;
import java.util.Scanner;

public class Scale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int count =0; //, num =0;
		final int MAXNUM = 1000;
		int[] Arr = new int[MAXNUM];
		
		while (sc.hasNext()) { //split이나, nextLine();후 String(s)이용. hasNext는 토큰화했을때 쓰는것@
			
			//String inputS = sc.next();
			//int input = Integer.parseInt(inputS);
			
			int input = sc.nextInt();
			Arr[count] = input;

			count ++; //총 count개 입력, index는 count-1까지 차있음. 			
			
		} 

		int count2 =0;
		String result;
		boolean mixedTest = false;
		
		for (int i=0;i<count-1;i++) {
			//if (i+1=count) {}
		
			if (Arr[i] == Arr[i+1]) {mixedTest = true; break;}
			else if (Arr[i] < Arr[i+1]) count2++;
			}
		
		if (count2 == 0 ) result = "descending" ;
		else if (count2 == count-1) result = "ascending" ;
		else result = "mixed";
		
		if (mixedTest == true) result = "mixed";  
		System.out.println(result);
		System.out.println(Arrays.toString(Arr));
	}
}

/*
switch (input) {
case "c": //num = 1;
	Arr[count] = 1;
	break;
case "d" : //num = 2;
	Arr[count] = 2;
	break;
case "e" : //num = 3;
	Arr[count] = 3;
	break;
case "f" : //num = 4;
	Arr[count] = 4;
	break;
case "g" : //num = 5;
	Arr[count] = 5;
	break;
case "a" : //num = 6;
	Arr[count] = 6;
	break;
case "b" : //num = 7;
	Arr[count] = 7;
	break;
case "C" : //num = 8;
	Arr[count] = 8;
	break;
}*/
