package com.sonata.CalTest;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.sonata.Calculator.Calculator;


public class CalTest {
	
	    public void divTest() {
	    	Calculator c1 = new Calculator();
	    	assertThrows(ArithmeticException.class,()->c1.div(10,0),"it is an error");
	    
	    }
}
