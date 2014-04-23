package shop;

/**
 * Interfaz que define el acceso a datos del sistema
 * @author Desarrollo
 *
 */
public interface IShopDataAccess {
	/**
	 * Devuelve el precio unitario del producto.
	 * 
	 * @param id
	 * @return
	 */
	double getProductPrice(int id);
	
	/**
	 * Metodo que se encarga de guardar una orden
	 * 
	 * @param id # de identificacion de 
	 * @param order referencia a la orden que se va a guardar
	 */
	void save(int id, Order order);
}
