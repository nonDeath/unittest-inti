package shop;

import java.util.ArrayList;
import java.util.List;

public class FakeShopDataAccess implements IShopDataAccess {
	
	private List<Product> products;
	
	public FakeShopDataAccess() {
		products = new ArrayList<Product>();
	}
	
	
	public double getProductPrice(int id) {
		Product p = findProductById(id);
		
		if(p == null) {
			throw new RuntimeException("Producto con id: " + id);
		}
		
		return p.getUnitPrice();
	}

	public void save(int id, Order order) {
		// TODO Auto-generated method stub

	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public Product findProductById(int id) {
		
		for(Product p: products) {
			if(p.getId() == id) {
				return p;
			}
		}
		
		return null;
		
	}

}
