/* 1748022 ������
 * (����5) Collections - ���� �޼ҵ� ���
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
	//sort()�� �̿��ϸ� abcd������ ���ĵ�. (���̴� ���x)
	
	public static void sortCollections() { //�÷���(collection) -> Collections.���� ����!
		ArrayList<String> v = new ArrayList<String>();
		v.add("kiwi");
		v.add("pear");
		v.add("apple");
		v.add("banana");
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ " ");
		}
		
		Collections.sort(v); //Colletion Ŭ������ �ִ� sort ��� Ȱ�� ->import�����. 
		System.out.println();
		
		for (int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ " ");
		}
	} //end of sortCollection method 
	
	public static void sortArrays() { //�迭(Array) -> Arrays Class����Ͽ� sort
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
		System.out.println((Arrays.toString(arr))); //Arrays �̿��� ��� [] ���·� ���� ��µ�
 	}

}
