package cashregister;

public class MockPrinter extends Printer{
	private String temp;
	
	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	@Override
	public void print(String printThis) {
		super.print(printThis);
		temp = printThis;
	}

}
