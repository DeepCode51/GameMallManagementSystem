package dao.admin;
import java.util.List;
import java.util.Map;

import entity.Cart;
import entity.Orders;
public interface OrdersDao {
	public void add(Orders Orders);
	public List<Map<String, Object>> selectOrders();
	public int updateOrders(int oid);
	public List<Map<String, Object>> selectOrders1();
	public void deleteOrders(int oid);
	public void updateCart();
	public void updateOrders();
	public void updateCart(int uid);
	
	
}
