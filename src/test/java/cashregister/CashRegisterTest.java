package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
    	Item[] item= {new Item("aaaa", 11)};
    	Purchase purchase = new Purchase(item);
    	
    	MockPrinter morkPrinter = new MockPrinter();
    	CashRegister cashRegister = new CashRegister(morkPrinter);
        //when
    	cashRegister.process(purchase);
        //then
    	System.out.println(morkPrinter.getTemp());
    	assertEquals("aaaa\t11.0\n", morkPrinter.getTemp());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
