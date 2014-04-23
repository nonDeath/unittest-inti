package shop;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test(expected=IllegalArgumentException.class)
	public void test() {
		IShopDataAccess data = null;
		Order o_O = new Order(1, data);
		
		assertNotNull(o_O);
	}
	
	@Test
	public void test02()
	{
		IShopDataAccess data = new DummyShopDataAccess();
		Order o_O = new Order(1, data);
		
		assertNotNull(o_O);
	}
}
