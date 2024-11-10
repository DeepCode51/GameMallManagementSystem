package service.before;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import entity.Cart;
public interface CartService {
	
	public String add(Cart cart, HttpSession session,Model model);
	public String selectCart(Model model, HttpSession session) ;
	public String deleteCart(Cart cart, Model model,HttpSession session);
	public String selectCart1(Model model, HttpSession session) ;
	public String deleteCart1(Cart cart, Model model,HttpSession session);

	
}
