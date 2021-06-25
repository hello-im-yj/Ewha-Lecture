/* 1748022 김유진
 * (예제4) Array매서드 활용
 * */

package ex4;

import java.util.ArrayList;

public class ArrayListUsing {
	
	public static void main (String args[]) {
		
		//ArrayList 생성
		ArrayList<Integer> mArrayList = new ArrayList<Integer> ();
		
		//값 추가 -add()
		mArrayList.add(10);
		mArrayList.add(20);
		mArrayList.add(30);
		mArrayList.add(40);
		mArrayList.add(50);
		System.out.println();
		
		//값 확인 - get(index)
		for (int i=0; i<mArrayList.size();i++) {
			System.out.println("one index "+i+" : value "+mArrayList.get(i));
		}
		System.out.println();
		
		//특정 index값 제거
		mArrayList.remove(0); //0번째 인덱스 값 제거 (자동으로 앞으로 땡겨짐)
		for (int i=0; i<mArrayList.size();i++) { //출력하여 결과값 확인
			System.out.println("two index "+i+" : value "+mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.add(0, 7777); //0번째 인덱스에 7777추가, 나머지는 자동으로 뒤로 밀림.
		for(int i=0;i<mArrayList.size();i++) {
			System.out.println("three index "+i+" : value "+mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.set(0,7779); //ArrayList의 set메소드(특정 인덱스값을 대체하는 메소드)
		for (int i=0;i<mArrayList.size();i++) {
			System.out.println("four index "+i+" : value "+mArrayList.get(i));
		} System.out.println();
		
		Integer checkNumber = new Integer(99999); //mArray에 담긴게 Integer클래스니까 type맞춰줌.
		boolean isFind = mArrayList.contains(checkNumber); //checkNumber값이 포함되었는지 확인
		
		if(!isFind) {
			mArrayList.add(checkNumber); //배열의 맨 뒤에 추가됨.
			System.out.println("five : 99999 - not found - so, add\n");
		}
		
		else {
			System.out.println("five : 99999 - already exist\n");
		}
		
		for (Integer val : mArrayList) {
			System.out.println("five : value :"+val);
		}System.out.println();
		
		//Value index확인
		
		int index = mArrayList.indexOf(checkNumber);
		System.out.println("six : index "+index +"\n");
		
		mArrayList.remove(index); // 위에서 찾은 인덱스로 삭제 - remove(index)
		mArrayList.clear(); //전체삭제 -clear()
		System.out.println("seven : size "+mArrayList.size()+"\n");
		
		boolean isEmpty = mArrayList.isEmpty();
		System.out.println("eight : empty "+isEmpty+"\n");
		
		
		
		
		
	}

}
