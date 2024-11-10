package controller.before;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.Cart;
import service.before.CartService;
@Controller
public class CartController {
   @Autowired
   private CartService cartService;
  
   @RequestMapping("/addCart")
   public String addCart(Cart cart,HttpSession session,Model model){
	   return cartService.add(cart,session,model);
   }
  
   @RequestMapping("/deleteCart")
   public String deleteCart(Cart cart,Model model,HttpSession session) {
	   return cartService.deleteCart(cart,model,session);
   }
	
	
   @RequestMapping("/selectCart")
   public String selectCart(Model model,HttpSession session) {
	   return cartService.selectCart(model,session);
   }
   @RequestMapping("/selectCart1")
   public String selectCart1(Model model,HttpSession session) {
	   return cartService.selectCart1(model,session);
   }
   @RequestMapping("/deleteCart1")
   public String deleteCart1(Cart cart,Model model,HttpSession session) {
	   return cartService.deleteCart1(cart,model,session);
   }
   
}
