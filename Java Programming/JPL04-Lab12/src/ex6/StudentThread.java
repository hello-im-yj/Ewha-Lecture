/* 1748022 김유진
 * (예제6) 집계판 만들기
 * */

package ex6;

public class StudentThread extends Thread {
	
	private SharedBoard board ;
	//construct.
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) { //add를 10번 실행시킴
			board.add();
		}
	}
	
	
}
