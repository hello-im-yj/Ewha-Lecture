/* 1748022 ������
 * (�ǽ�2) �ѿ�����
 * */

package pm2;

public class Dictionary {
	
	static String[] kor = new String[] {"���","�Ʊ�","��","�̷�","���"};
	static String[] eng = new String[] {"love","baby","money","future","hope"};
	static final int WORDCOUNT =5;
	
	public static String korToEngWord(String korWord) {
		for(int i =0; i<WORDCOUNT; i++) {
			if (korWord.equals(kor[i])) return eng[i];
		}
		System.out.println(korWord+"�� ���� ������ �����ϴ�.");
		return null;
	}
	
	
	
}
