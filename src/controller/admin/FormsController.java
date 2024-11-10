package controller.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Forms;
import service.admin.FormsService;

@Controller
public class FormsController {
  @Autowired
  private FormsService formsService;

  @RequestMapping("/addForms")
  public String add(Forms forms,Model model) {
	  return formsService.add(forms,model);
  }
  @RequestMapping("/addForms1")
  public String toadd() {
	  return "admin/addForms";
  }
  @RequestMapping("/deleteForms")
  public String deleteForms(Model model,Forms forms) {
	  return formsService.deleteForms(forms,model);
  }
  
  @RequestMapping("/selectForms")
  public String selectForms(Model model) {
	  return formsService.selectForms(model);
  }
  
  @RequestMapping("/selectForms1")
  public String selectForms1(Model model) {
	  return formsService.selectForms1(model);
  }
  
  
  
}
