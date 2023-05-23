package j1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestFactorial {
	Factorial factorial;
	
	//@Before will innitiate the factorial everytime JUNIT is tested
	@Before
	public void init() {
		factorial = new Factorial();
	}
	
	@Test
	public void  testfactWhenInputIsZero() {
		//Factorial factorial = new Factorial();
		int actual = factorial.fact(0);
		assertEquals(1, actual);
	}
	@Test
	public void  testfactWhenInputIsOne() {
		//Factorial factorial = new Factorial();
		int actual = factorial.fact(1);
		assertEquals(1, actual);
	}
	@Test
	public void  testfactWhenInputIsFive() {
		//Factorial factorial = new Factorial();
		int actual = factorial.fact(5);
		assertEquals(120, actual);
	}
	@Test(expected = ArithmeticException.class)
	public void  testfactWhenInputIsNegative() {
		//Factorial factorial = new Factorial();
		factorial.fact(-5);
		
	}
	
}
