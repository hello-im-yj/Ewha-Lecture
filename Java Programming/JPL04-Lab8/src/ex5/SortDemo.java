/* 1748022 김유진
 * (예제5) Collections - 정렬 메소드 사용
 * */

package ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortDemo {
	
	public static void main (String args[]) {
		sortCollections();
		System.out.println();
		
		sortArrays();
		System.out.println();	
	}
	//sort()를 이용하면 abcd순으로 정렬됨. (길이는 상관x)
	
	public static void sortCollections() { //컬렉션(collection) -> Collections.으로 접근!
		ArrayList<String> v = new ArrayList<String>();
		v.add("kiwi");
		v.add("pear");
		v.add("apple");
		v.add("banana");
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ " ");
		}
		
		Collections.sort(v); //Colletion 클래스에 있는 sort 기능 활용 ->import해줘야. 
		System.out.println();
		
		for (int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ " ");
		}
	} //end of sortCollection method 
	
	public static void sortArrays() { //배열(Array) -> Arrays Class사용하여 sort
		String[] arr = new String[4];
		arr[0] = "tiger";
		arr[1] = "monkey" ;
		arr[2] = "cow";
		arr[3] = "cat";
		
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		Arrays.sort(arr);
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		System.out.println((Arrays.toString(arr))); //Arrays 이용한 출력 [] 형태로 원소 출력됨
 	}

}
