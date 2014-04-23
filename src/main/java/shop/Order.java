package shop;
/**
 * Clase que representa a la orden de compra.
 * @author Desarrollo
 *
 */
public class Order {
	private int id;
	private IShopDataAccess dataAccess;
	private OrderLineCollection orderLines;
	
	public Order(int id, IShopDataAccess dataAccess) {
		
		if(dataAccess == null) {
			throw new IllegalArgumentException();
		}
		
		this.id = id;
		this.dataAccess = dataAccess;
		
		orderLines = new OrderLineCollection();
	}
	
	public void save() {
		this.dataAccess.save(this.id, this);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public IShopDataAccess getDataAccess() {
		return dataAccess;
	}
	public void setDataAccess(IShopDataAccess dataAccess) {
		this.dataAccess = dataAccess;
	}
	public OrderLineCollection getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(OrderLineCollection orderLines) {
		this.orderLines = orderLines;
	}
	
	
}
