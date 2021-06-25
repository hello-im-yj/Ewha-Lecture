/* 1748022 ������
 * (����4) Array�ż��� Ȱ��
 * */

package ex4;

import java.util.ArrayList;

public class ArrayListUsing {
	
	public static void main (String args[]) {
		
		//ArrayList ����
		ArrayList<Integer> mArrayList = new ArrayList<Integer> ();
		
		//�� �߰� -add()
		mArrayList.add(10);
		mArrayList.add(20);
		mArrayList.add(30);
		mArrayList.add(40);
		mArrayList.add(50);
		System.out.println();
		
		//�� Ȯ�� - get(index)
		for (int i=0; i<mArrayList.size();i++) {
			System.out.println("one index "+i+" : value "+mArrayList.get(i));
		}
		System.out.println();
		
		//Ư�� index�� ����
		mArrayList.remove(0); //0��° �ε��� �� ���� (�ڵ����� ������ ������)
		for (int i=0; i<mArrayList.size();i++) { //����Ͽ� ����� Ȯ��
			System.out.println("two index "+i+" : value "+mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.add(0, 7777); //0��° �ε����� 7777�߰�, �������� �ڵ����� �ڷ� �и�.
		for(int i=0;i<mArrayList.size();i++) {
			System.out.println("three index "+i+" : value "+mArrayList.get(i));
		}
		System.out.println();
		
		mArrayList.set(0,7779); //ArrayList�� set�޼ҵ�(Ư�� �ε������� ��ü�ϴ� �޼ҵ�)
		for (int i=0;i<mArrayList.size();i++) {
			System.out.println("four index "+i+" : value "+mArrayList.get(i));
		} System.out.println();
		
		Integer checkNumber = new Integer(99999); //mArray�� ���� IntegerŬ�����ϱ� type������.
		boolean isFind = mArrayList.contains(checkNumber); //checkNumber���� ���ԵǾ����� Ȯ��
		
		if(!isFind) {
			mArrayList.add(checkNumber); //�迭�� �� �ڿ� �߰���.
			System.out.println("five : 99999 - not found - so, add\n");
		}
		
		else {
			System.out.println("five : 99999 - already exist\n");
		}
		
		for (Integer val : mArrayList) {
			System.out.println("five : value :"+val);
		}System.out.println();
		
		//Value indexȮ��
		
		int index = mArrayList.indexOf(checkNumber);
		System.out.println("six : index "+index +"\n");
		
		mArrayList.remove(index); // ������ ã�� �ε����� ���� - remove(index)
		mArrayList.clear(); //��ü���� -clear()
		System.out.println("seven : size "+mArrayList.size()+"\n");
		
		boolean isEmpty = mArrayList.isEmpty();
		System.out.println("eight : empty "+isEmpty+"\n");
		
		
		
		
		
	}

}
