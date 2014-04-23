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

	
	@Test
	public void test03()
	{
		IShopDataAccess data = new DummyShopDataAccess();
		Order o_O = new Order(1, data);
		
		o_O.getOrderLines().addOrderLine(1, 3);
		o_O.getOrderLines().addOrderLine(2, 1);
		
		assertEquals(2, o_O.getOrderLines().size());
	}

	@Test
	public void testTotal()
	{
		IShopDataAccess data = new StubShopDataAccess();
		Order o_O = new Order(1, data);
		
		o_O.getOrderLines().addOrderLine(1, 1);
		
		double total = o_O.getOrderLines().get(0).getTotal();
		
		assertEquals(25, total, 0);
	}

	@Test
	public void testTotal2()
	{
		IShopDataAccess data = new StubShopDataAccess();
		Order o_O = new Order(5, data);
		
		o_O.getOrderLines().addOrderLine(1, 3);
		o_O.getOrderLines().addOrderLine(2, 5);
		o_O.getOrderLines().addOrderLine(3, 1);
		
		double total1 = o_O.getOrderLines().get(0).getTotal();
		double total2 = o_O.getOrderLines().get(1).getTotal();
		double total3 = o_O.getOrderLines().get(2).getTotal();
		
		assertEquals(75, total1, 0);
		assertEquals(125, total2, 0);
		assertEquals(25, total3, 0);
	}
	
	@Test
	public void testTotalFake1()
	{
		FakeShopDataAccess data = new FakeShopDataAccess();
		Order o_O = new Order(6, data);
		Product p = new Product(1, 148);
		
		data.getProducts().add(p);
		
		
		o_O.getOrderLines().addOrderLine(1, 2);
		
		double total = o_O.getOrderLines().get(0).getTotal();
		
		assertEquals(296, total, 0);
		
	}
	
	@Test
	public void testTotalFake2()
	{
		FakeShopDataAccess data = new FakeShopDataAccess();
		Order o_O = new Order(6, data);
		Product p = new Product(1, 148);
		
		data.getProducts().add(p);
		
		Product p2 = new Product(2, 14.5);
		
		data.getProducts().add(p2);
		
		o_O.getOrderLines().addOrderLine(1, 2);
		
		o_O.getOrderLines().addOrderLine(2, 3);
		
		double total = o_O.getOrderLines().get(0).getTotal();
		double total2 = o_O.getOrderLines().get(1).getTotal();
		
		assertEquals(296, total, 0);
		assertEquals(43.5, total2, 0);
	}	
}
