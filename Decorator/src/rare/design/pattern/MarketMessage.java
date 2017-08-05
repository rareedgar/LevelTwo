package rare.design.pattern;

public class MarketMessage implements Message {
	
	private String name;
	private String symbol;
	private double price;
	
	public MarketMessage( String name, String symbol,double price)
	{
		this.name = name;
		this.symbol = symbol;
		this.price = price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String Symbol() {
		// TODO Auto-generated method stub
		return symbol;
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

}
