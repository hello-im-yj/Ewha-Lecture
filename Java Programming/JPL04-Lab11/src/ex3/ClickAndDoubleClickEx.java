/* 1748022 김유진
 * (예제 3) 마우스 더블 클릭 발생 이벤트 처리
 * */


package ex3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame {
	
	public ClickAndDoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane() ;
		c.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() ==2) {
				//0~255 사이 랜덤 값 얻기
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,b,g));
			}
		}
	}
	
	public static void main (String args[]) {
		new ClickAndDoubleClickEx();
	}

}
