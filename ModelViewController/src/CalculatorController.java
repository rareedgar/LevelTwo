package rare.design.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	CalculatorModel calcModel;
	CalculatorView calcView;
	
	public CalculatorController(CalculatorModel cm , CalculatorView cv)
	{
		calcModel = cm;
		calcView = cv;
		
		cv.addListener(new CalculateListener());
	}
	
	
	class CalculateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			calcModel.calculate(calcView.getNum1(), calcView.getNum2());
			
			calcView.setResult(Integer.toString(calcModel.getData()));

		}

	}


}
