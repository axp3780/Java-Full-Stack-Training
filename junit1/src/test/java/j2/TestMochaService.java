package j2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class TestMochaService {

	/*
	public int compute(int num) {
		if (num<0) {
			throw new RuntimeException("Num cannot be negative");
		}
		int rand = mathUtil.findRandNum();
		rand= rand +9+(num*num);
		return rand;*/
	@Mock //it will create mock object of mathUtil
	private MathUtil mathUtil;
	
	@InjectMocks //this annotation creates real object of MochaService and inject mock mathUtil inside it
	private MochaService mochaService;
	
	@Before
	public void anything() {
		System.out.println("New test case Started");
		MockitoAnnotations.openMocks(this);
	}
	
	@After
	public void  chou() {
		System.out.println("Test is completed");
	}
	
	
	@Test(expected = RuntimeException.class)
	public void testComputeWhenNumNegative() {
		mochaService.compute(-4);
	}
	
	
	@Test
	public void testComputeWhenNumIsTen() {
		Mockito.when(mathUtil.findRandNum()).thenReturn(30);
		int result = mochaService.compute(10);
		assertEquals(139, result);
		//this is to verify the MathUtil is called only one time
		verify(mathUtil, times(1)).findRandNum();
		verifyNoMoreInteractions(mathUtil);
		
	}
	
	@Test
	public void testComputeWhenNumIsZero() {
		Mockito.when(mathUtil.findRandNum()).thenReturn(30);
		int result = mochaService.compute(0);
		assertEquals(39, result);
		//this is to verify the MathUtil is called only one time
		verify(mathUtil, times(1)).findRandNum();
		verifyNoMoreInteractions(mathUtil);
	}
	
	
	@Test
	@Ignore
	public void couldNotComplete() {
		System.out.println("this is not going to execute due to @Ignore");
	}

	
	
}
