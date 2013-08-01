package net.gregio;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void pegaValor72EmFibonacciIteractive(){
		assertEquals(Fibonacci.iteractive(42),  267914296);
	}
	
	@Test
	public void pegaValor72EmFibonacciRecurvive(){
		assertEquals(Fibonacci.recurcive(42),  267914296);
	}
		
}
