
public class CalculatorModel {
	
	int data;
	
	void calculate(int x , int y)
	{
		data = x + y;
	}
	
	int getData()
	{
		System.out.println("added:" + data);
		return data;
		
	}
	

}
