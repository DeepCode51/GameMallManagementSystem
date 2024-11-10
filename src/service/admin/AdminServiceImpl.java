package service.admin;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import dao.admin.AdminDao;
import entity.Admin;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;
	@Override
	public String login(Admin admin, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		if(adminDao.login(admin).size() > 0){
			session.setAttribute("admin", admin);
			return "admin/main";
		}else {
		model.addAttribute("mess", "ÕËºÅÃÜÂë²»ÕıÈ·");
		return "admin/adminLogin";
	}
}}
