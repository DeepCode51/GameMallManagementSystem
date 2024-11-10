package service.admin;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import entity.Cart;
import entity.Orders;
public interface OrdersService {
	public String add(Orders Orders, HttpSession session,Cart cart,String a,String b,String c,Model model);
	public String selectOrders(Model model);
	public String updateOrders(Model model);
	public String selectOrders1(Model model);
	public String deleteOrders(Orders orders, Model model);
}
