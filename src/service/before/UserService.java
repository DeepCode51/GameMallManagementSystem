package service.before;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import entity.User;
public interface UserService {
	public String login(User User, Model model, HttpSession session);
	public String addUser(User User,  BindingResult result,Model model);
	public String updateUser(HttpSession session, User User, Model model);
	public String deleteUser(User User, Model model);
	public String  selectUser(Model model);
}
