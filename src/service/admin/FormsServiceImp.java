package service.admin;
import java.io.File;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import dao.admin.FormsDao;
import dao.admin.JewelryDao;
import entity.Forms;
import util.MyUtil;

@Service("formsService")
public class FormsServiceImp implements FormsService {
    @Autowired
    private FormsDao formsDao;
    @Override
	public String add(Forms Forms, Model model) {
		// TODO Auto-generated method stub
		formsDao.add(Forms);
		model.addAttribute("mess", "Ìí¼Ó³É¹¦£¡");
		return "admin/adminbac";
	}
	@Override
	public String deleteForms(Forms Forms, Model model) {
		// TODO Auto-generated method stub
		formsDao.deleteForms(Forms.getFid());
		   List<Forms> list=formsDao.selectForms();
			model.addAttribute("list", list);
			return "admin/showForms";
	}
	@Override
	public String selectForms(Model model) {
		// TODO Auto-generated method stub
		List<Forms> list=formsDao.selectForms();
		model.addAttribute("list", list);
		return "admin/showForms";
	}
	@Override
	public String selectForms1(Model model) {
		List<Forms> list=formsDao.selectForms();
		model.addAttribute("list", list);
		return "admin/addJewelry";
	}
	@Override
	public String selectForms2(Model model) {
		// TODO Auto-generated method stub
		List<Forms> list=formsDao.selectForms();
		model.addAttribute("list1", list);
		return  "user/main";
	}

}
