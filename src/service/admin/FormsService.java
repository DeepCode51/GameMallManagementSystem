package service.admin;
import org.springframework.ui.Model;
import entity.Forms;
public interface FormsService {

	public String add(Forms Forms, Model model);
	public String deleteForms(Forms Forms, Model model);
	public String selectForms(Model model);
	public String selectForms1(Model model);
	public String selectForms2(Model model);


	

}
