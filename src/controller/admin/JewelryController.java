package controller.admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.Jewelry;
import service.admin.JewelryService;
@Controller
public class JewelryController {
  @Autowired
  private JewelryService JewelryService;
 
  @RequestMapping("/addJewelry")
  public String add(Jewelry Jewelry,Model model,HttpServletRequest req,HttpSession session) {
		  return JewelryService.add(Jewelry,model,req);
  }
  @RequestMapping("/selectJewelry")
  public String selectJewelry(Model model, Integer pageCur) {
	  return JewelryService.selectJewelry(model,  pageCur);
  }
  @RequestMapping("/deleteJewelry")
  public String deleteJewelry(Model model,Jewelry Jewelry) {
	  return JewelryService.deleteJewelry(Jewelry,model);
  }
  @RequestMapping("/selectJewelry1")
  public String selectJewelry1(Model model) {
	  return JewelryService.selectJewelry1(model);
  }
  @RequestMapping("/selectJewelryByID")
  public String selectJewelryByID(Jewelry Jewelry,Model model) {
	  return JewelryService.selectJewelryByID(Jewelry,model);
  }
  @RequestMapping("/updateJewelry")
  public String updateJewelry(Jewelry Jewelry,Model model,HttpSession session) {
	  return JewelryService.updateJewelry(Jewelry,model,session);
  }
}
