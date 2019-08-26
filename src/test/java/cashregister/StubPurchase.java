package cashregister;

public class StubPurchase extends Purchase{

	public StubPurchase() {
		super(new Item[0]);
	}

	@Override
	public String asString() {
		
		return "aaaa\t11.0\n";
	}
	
}
