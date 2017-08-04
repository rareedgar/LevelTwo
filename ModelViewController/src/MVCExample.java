package rare.design.pattern;

public class MVCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorModel cm = new CalculatorModel();
		CalculatorView cv = new CalculatorView();
		CalculatorController cc = new CalculatorController(cm,cv);

	}

}
