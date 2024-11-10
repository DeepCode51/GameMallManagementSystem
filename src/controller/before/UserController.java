package controller.before;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.User;
import service.admin.FormsService;
import service.before.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService UserService;
	@Autowired
	private FormsService formsService;
	@RequestMapping("/selectUser")
	public String selectUser(Model model) {
		return UserService.selectUser(model);
	}
	@RequestMapping("/deleteUser")
	public String deleteUser(User User,Model model) {
		return UserService.deleteUser(User, model);
	}
	@RequestMapping("userlogin1")
	public String login(@ModelAttribute User User, Model model, HttpSession session) {
		return UserService.login(User, model, session);
	}
	@RequestMapping("/addUser")
	public String toregister(@ModelAttribute User user) {
		return "user/addUser";
	}
	@RequestMapping("/addUser1")
	public String addUser1(@Valid @ModelAttribute User user,BindingResult result, Model model) {
		
		return UserService.addUser(user, result,model);
		
	}
	@RequestMapping("/selectUserByUid")
	public String myInformation(HttpSession session, Model model){
		User User = (User)session.getAttribute("user");
		if(User==null) {
			model.addAttribute("mess", "ÇëµÇÂ¼£¡");
			return "user/error";
		}
		model.addAttribute("User", User);
		return "user/updateUser";
	}
	@RequestMapping("/updateUser")
	public String updateUser(HttpSession session, User User, Model model){
		
		return UserService.updateUser(session, User, model);
	}
	
	@RequestMapping("/UserClear")
	public String loginout(HttpSession session,Model model){
		session.invalidate();
		model.addAttribute("mess", "»¶Ó­ÏÂ´ÎµÇÂ¼£¡");
		return "user/maincenter";
	}
	@RequestMapping("/i18n")
	public String i18n(@ModelAttribute User User) {
		return "forward:userMain";
	}
	@RequestMapping("userMain")
	public String userMain(Model model) {
		return "user/main";
	}
	
}
