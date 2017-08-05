package rare.design.pattern;

public class LimitMsgDecorator extends MsgDecorator {
	
	public LimitMsgDecorator(Message msg)
	{
		super(msg);
	}
	
	
	public double price()
	{
	   return super.price() + 1;  // just at 
	}
	

}
