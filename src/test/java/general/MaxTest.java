package general;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MaxTest {

	private Max testingMax;
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void test() {
		
		// arrange
		int a = 3;
		int b = 4;
		
		Max m = new Max();
		
		// act
		int ret = m.max(a, b);
		// assert
		assertEquals(4, ret);
	}
	
	@Test
	public void test2() {
		int a = 145;
		int b = 44;
		
		Max m = new Max();
		
		int res = m.max(a, b);
		
		assertTrue(res == 145);
	}
}
