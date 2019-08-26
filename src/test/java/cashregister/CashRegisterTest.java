package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CashRegisterTest {
	
	private static MockPrinter morkPrinter;
	private static CashRegister cashRegister;

	@BeforeAll
	public static void setUp() {
		morkPrinter = new MockPrinter();
    	cashRegister = new CashRegister(morkPrinter);
	}
	
	@BeforeEach
	public static void Clean() {
		morkPrinter.setTemp("");
	}
	
    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
    	Item[] item= {new Item("aaaa", 11)};
    	Purchase purchase = new Purchase(item);
        //when
    	cashRegister.process(purchase);
        //then
    	assertEquals("aaaa\t11.0\n", morkPrinter.getTemp());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
    	StubPurchase stubPurchase = new StubPurchase();
    	//when
    	cashRegister.process(stubPurchase);
        //then
    	assertEquals("aaaa\t11.0\n", morkPrinter.getTemp());
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
