package service.before;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import dao.before.UserDao;
import entity.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao UserDao;
	@Override
	public String login( User User, Model model, HttpSession session) {
		// TODO Auto-generated method stub
		if(UserDao.login(User).size() > 0){
			session.setAttribute("user", UserDao.login(User).get(0));
			model.addAttribute("mess","登录成功");
			return "user/maincenter";
		}else {
		model.addAttribute("mess", "登录失败，用户名或密码错误");
		return "user/maincenter";
	}
	}
	@Override
	public String addUser(User User,  BindingResult result,Model model) {
		// TODO Auto-generated method stub
		if(result.hasErrors()) {
			return "user/addUser";
		}
		if(UserDao.addUser(User) > 0)
		{
			 model.addAttribute("mess","成功注册账号");
			return "user/maincenter2";
		}else {
			return "user/addUser";
		}
	}

	@Override
	public String updateUser(HttpSession session, User User, Model model) {
		// TODO Auto-generated method stub
		    UserDao.updateUser(User);
		    model.addAttribute("mess", "修改成功");
		    session.invalidate();
			return "user/maincenter";
	
	}
	@Override
	public String selectUser(Model model) {
		// TODO Auto-generated method stub
		List<User> list=UserDao.selectUser();
		model.addAttribute("list", list);
		return "admin/showUser";	
	}
	@Override
	public String deleteUser(User User, Model model) {
		// TODO Auto-generated method stub
		int i=UserDao.deleteUser(User.getUid());
		if( i> 0){
			List<User> list=UserDao.selectUser();
			model.addAttribute("list", list);
			return "admin/showUser";
		}else{
			return "error/error";
		}
	}

	
	
	
}
