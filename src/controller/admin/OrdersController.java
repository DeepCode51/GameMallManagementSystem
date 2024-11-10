package controller.admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Cart;
import entity.Orders;
import service.admin.OrdersService;


@Controller
public class OrdersController {
  @Autowired
  private OrdersService ordersService;

  @RequestMapping("/addOrders")
  public String addOrders(Orders Orders,HttpSession session,Cart cart,String a,String b,String c,Model model) {
	   return ordersService.add(Orders, session,cart, a, b, c,model);
  }
  @RequestMapping("/selectOrders")
  public String selectOrders(Model model)  {
	   return ordersService.selectOrders(model);
  }
  @RequestMapping("/selectOrders1")
  public String selectOrders1(Model model)  {
	   return ordersService.selectOrders1(model);
  }
  @RequestMapping("/updateOrders")
  public String updateOrders(Model model) {
	   return ordersService.updateOrders(model);
  }
  
  @RequestMapping("/deleteOrders")
  public String deleteOrders(Orders orders,Model model) {
	   return ordersService.deleteOrders(orders,model);
  }
}
