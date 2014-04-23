package shop;

public class SpyShopDataAccess implements IShopDataAccess {

	private boolean saved = false;
	
	public double getProductPrice(int id) {
		// TODO Auto-generated method stub
		return 25;
	}

	public void save(int id, Order order) {
		// TODO Auto-generated method stub
		saved = true;
	}

	public boolean getSaved(){
		return saved;
	}

}
