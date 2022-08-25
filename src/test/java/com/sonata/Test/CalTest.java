package com.sonata.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.sonata.Calculator.Calculator;


 class CalTest {
	@Test
	   void divTest() {
	    	Calculator c1 = new Calculator();
	    	assertThrows(ArithmeticException.class,()->c1.div(10,0),"it is an error");
	    
	    }
}
