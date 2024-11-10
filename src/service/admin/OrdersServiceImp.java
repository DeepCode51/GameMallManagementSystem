package service.admin;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import dao.admin.OrdersDao;
import dao.admin.JewelryDao;
import dao.before.CartDao;
import dao.before.IndexDao;
import entity.Cart;
import entity.Orders;
import entity.Jewelry;
import entity.User;
@Service("OrdersService")
public class OrdersServiceImp implements OrdersService{
    @Autowired
    private OrdersDao ordersDao;
    @Autowired
    private CartDao cartDao;
    @Autowired
    private IndexDao indexDao;
	@Override
	public String updateOrders(Model model) {
		// TODO Auto-generated method stub
		ordersDao.updateCart();
		ordersDao.updateOrders();
		model.addAttribute("mess", "发货成功！");
		return "admin/adminbac";
	}
	@Override
	public String selectOrders(Model model){
		// TODO Auto-generated method stub
		List<Map<String, Object>>orders=ordersDao.selectOrders();                                                                                                                                                
		model.addAttribute("list", orders);
		return "admin/showOrders";
	}
	@Override
	public String add(Orders Orders, HttpSession session,Cart cart,String a,String b,String c,Model model) {
		// TODO Auto-generated method stub
		 User user=(User)session.getAttribute("user");
		 List<Map<String, Object>> listcart1=cartDao.selectCart(user.getUid()); 
		 String jewelryinfo="";
		 for (Map map : listcart1) 
		 { 
		 cart.setReceivings(a+"、"+b+"、"+c); 
		 Jewelry Jewelry=new Jewelry();
		 Jewelry.setJid(Integer.parseInt(map.get("jid").toString()));
		 Jewelry.setJewelry_store(Integer.parseInt(map.get("nums").toString()));
		 jewelryinfo=map.get("jname").toString()+map.get("nums").toString()+" ";
		 indexDao.updateJewelry1(Jewelry); 
		  }
		 Orders.setJewelryinfo(jewelryinfo);
		 Orders.setUserinfo(a+"/"+b+"/"+c);
		 ordersDao.add(Orders); 
		 cartDao.updateCart1(user.getUid());
		 model.addAttribute("mess", "结算成功！");
		 return "user/maincenter";
	}
	@Override
	public String selectOrders1(Model model) {
		// TODO Auto-generated method stub
		List<Map<String, Object>>orders=ordersDao.selectOrders1();                                                                                                                                                
		model.addAttribute("list", orders);
		return "admin/showOrders1";
	}

	@Override
	public String deleteOrders(Orders orders, Model model) {
		// TODO Auto-generated method stub
		ordersDao.deleteOrders(orders.getOid());
		List<Map<String, Object>>list=ordersDao.selectOrders1();                                                                                                                                                
		model.addAttribute("list", list);
		model.addAttribute("mess", "删除成功");
		return "admin/showOrders1";
	}
	
}
