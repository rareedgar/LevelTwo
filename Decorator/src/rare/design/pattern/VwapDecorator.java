package rare.design.pattern;

public class VwapDecorator extends MsgDecorator{
	
		public VwapDecorator(Message msg)
		{
			super(msg);
			System.out.println("Vwap Price ...");
		}
		
		
		public double price()
		{
		   return super.price()/2 ;  // just at 
		}
		

	

}
