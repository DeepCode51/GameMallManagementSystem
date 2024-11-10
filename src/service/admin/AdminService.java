package service.admin;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import entity.Admin;
public interface AdminService {
	public String login(Admin Sellers, Model model, HttpSession session);
	
}
