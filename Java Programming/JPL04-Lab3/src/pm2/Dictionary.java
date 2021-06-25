/* 1748022 김유진
 * (실습2) 한영사전
 * */

package pm2;

public class Dictionary {
	
	static String[] kor = new String[] {"사랑","아기","돈","미래","희망"};
	static String[] eng = new String[] {"love","baby","money","future","hope"};
	static final int WORDCOUNT =5;
	
	public static String korToEngWord(String korWord) {
		for(int i =0; i<WORDCOUNT; i++) {
			if (korWord.equals(kor[i])) return eng[i];
		}
		System.out.println(korWord+"는 저희 사전에 없습니다.");
		return null;
	}
	
	
	
}
