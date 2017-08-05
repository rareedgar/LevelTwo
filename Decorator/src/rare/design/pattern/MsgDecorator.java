package rare.design.pattern;

public abstract class MsgDecorator implements Message {

	private Message msg;
	
	public MsgDecorator(Message msg)
	{
		this.msg = msg;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return msg.name();
	}

	@Override
	public String Symbol() {
		// TODO Auto-generated method stub
		return msg.Symbol();
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return msg.price();
	}
	
	public void setPrice(double price)
	{
		msg.setPrice(price);
	}

}
