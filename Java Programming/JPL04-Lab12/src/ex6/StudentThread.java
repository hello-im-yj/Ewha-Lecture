/* 1748022 ������
 * (����6) ������ �����
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
		for(int i=0;i<10;i++) { //add�� 10�� �����Ŵ
			board.add();
		}
	}
	
	
}
