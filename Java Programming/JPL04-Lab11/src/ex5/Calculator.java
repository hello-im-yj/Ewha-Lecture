/* 1748022 김유진
 * (예제 5) MVC 패턴 이해
 * */

package ex5;

import javax.swing.JFrame;

public class Calculator {
	public static void main(String[] args) {
		/* create new model, view and controller */
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);
		
		/* register controller as listener */
		view.registerListener(controller);
		
		/* start it up */
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(400, 300);
		view.setVisible(true);
	}
}


///**
// * The Calculator class along with CalculatorController,
// * CalculatorModel and CalculatorView implements a 
// * simple-minded calculator.
// * The implementation is based on the MVC design pattern.
// * 
// * @author Tom Bylander
// */
//public class Calculator {
//	/**
//	 * Create the model, view and controller objects,
//	 * and launch the application.
//	 */
//	public static void main(String[] args) {
//		/* create new model, view and controller */
//		CalculatorModel model = new CalculatorModel();
//		CalculatorView view = new CalculatorView();
//		CalculatorController controller = new CalculatorController(model, view);
//		
//		/* register controller as listener */
//		view.registerListener(controller);
//		
//		/* start it up */
//		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		view.setSize(400, 300);
//		view.setVisible(true);
//	}
//}

