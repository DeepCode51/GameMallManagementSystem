package controller.admin;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import entity.Admin;
import service.admin.AdminService;
@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	@RequestMapping("adminLogin1")
	public String login( Admin admin, Model model, HttpSession session) {
		return adminService.login(admin, model, session);
	}
	@RequestMapping("adminLogin")
	public String adminlogin1() {
		return "admin/adminLogin";
	}
	@RequestMapping("adminMain")
	public String fanhui() {
		return "admin/main";
	}
	@RequestMapping("adminIframes")
	public String adminIframes() {
		return "admin/iframes";
	}
	@RequestMapping("/tuichu")
	public String tuichu() {
		return "user/main";
	}
}
