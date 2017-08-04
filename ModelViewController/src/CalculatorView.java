package rare.design.pattern;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView  extends JFrame {
	
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JButton add = new JButton("ADD");
	JTextField result = new JTextField(10);
	
	JPanel calcPanel = new JPanel();

   	public CalculatorView()
   	{
   		calcPanel.add(num1);
   		calcPanel.add(num2);
   		calcPanel.add(add);
   		calcPanel.add(result);
   		this.add(calcPanel);
   	    
   	 
   	     this.setSize(300, 300);
   	 
   	     this.setLocationRelativeTo(null);
   	 
   	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   	     this.setVisible(true);

   	}
	
    public void addListener(ActionListener al)
    {
    	add.addActionListener(al);
    }
    
    public int getNum1()
    {
    	return Integer.parseInt(num1.getText());
    }
    
    public int getNum2()
    {
    	return Integer.parseInt(num2.getText());
    }
    
    public void setResult(String si)
    {
    	result.setText(si);
    }
}
