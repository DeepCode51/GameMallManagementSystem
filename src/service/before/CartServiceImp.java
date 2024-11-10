package service.before;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import dao.before.CartDao;
import entity.Cart;
import entity.User;
@Service("cartService")
public class CartServiceImp implements CartService{
    @Autowired
    private CartDao cartDao;
	
	@Override
	public String add(Cart cart, HttpSession session,Model model) {
		// TODO Auto-generated method stub
		User u=(User) session.getAttribute("user");
		if(u==null) {
			    model.addAttribute("mess", "ÇëµÇÂ¼£¡");
				return "user/error";
		}else {
			cart.setUid(u.getUid());
			cart.setTotalprice(cart.getPrice()*cart.getNums());
			cartDao.add(cart);
			 model.addAttribute("mess", "¼ÓÈë¹ºÎï³µ³É¹¦£¡");
				return "user/maincenter";
		}
	}
	@Override
	public String deleteCart(Cart cart, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		User u=(User) session.getAttribute("user");
		int re=cartDao.deleteCart(cart);
		if(re>0) {
			List<Map<String, Object>>listcart=cartDao.selectCart(u.getUid());
			model.addAttribute("list", listcart);
			return "user/showCart";
		}else {
			return "/error/error";
		}
	}

	@Override
	public String selectCart(Model model, HttpSession session){
		// TODO Auto-generated method stub
		User u=(User) session.getAttribute("user");
		if(u==null) {
			model.addAttribute("mess", "ÇëµÇÂ¼£¡");
			return "user/error";
		}else {
		List<Map<String, Object>>listcart=cartDao.selectCart(u.getUid());
		model.addAttribute("list", listcart);
		return "user/showCart";
		}
	}
	@Override
	public String selectCart1(Model model, HttpSession session){
		// TODO Auto-generated method stub
		User u=(User) session.getAttribute("user");
		if(u==null) {
			model.addAttribute("mess", "ÇëµÇÂ¼£¡");
			return "user/error";
		}else {
		List<Map<String, Object>>listcart=cartDao.selectCart1(u.getUid());
		model.addAttribute("list", listcart);
		return "user/showCart1";
		}
	}
	@Override
	public String deleteCart1(Cart cart, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		User u=(User) session.getAttribute("user");
			if(u==null) {
				model.addAttribute("mess", "ÇëµÇÂ¼£¡");
				return "user/error";
			}else {
			cartDao.deleteCart(cart);
			List<Map<String, Object>>listcart=cartDao.selectCart1(u.getUid());
			model.addAttribute("list", listcart);
			return "user/showCart1";
			}
		}
	
	
}
