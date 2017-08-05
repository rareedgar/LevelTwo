package rare.design.pattern;

public class MsgProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message msg = new VwapDecorator(new LimitMsgDecorator(new MarketMessage("OrderMsg", "IBM.N", 101)));
		
		System.out.println(msg.name() + " " + msg.Symbol() + " " + msg.price());
		
		

	}

}
