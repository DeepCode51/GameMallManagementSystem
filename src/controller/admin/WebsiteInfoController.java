package controller.admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.WebsiteInfo;
import service.admin.WebsiteInfoService;
@Controller
public class WebsiteInfoController {
  @Autowired
  private WebsiteInfoService WebsiteInfoService;
 
  @RequestMapping("/addWebsiteInfo")
  public String add(WebsiteInfo WebsiteInfo,Model model,HttpServletRequest req,HttpSession session) {
		  return WebsiteInfoService.add(WebsiteInfo,model,req);
  }
  @RequestMapping("/selectWebsiteInfo")
  public String selectWebsiteInfo(Model model) {
	  return WebsiteInfoService.selectWebsiteInfo(model);
  }
  @RequestMapping("/deleteWebsiteInfo")
  public String deleteWebsiteInfo(Model model,WebsiteInfo WebsiteInfo) {
	  return WebsiteInfoService.deleteWebsiteInfo(WebsiteInfo,model);
  }
  @RequestMapping("/selectWebsiteInfoByID")
  public String selectWebsiteInfoByID(WebsiteInfo WebsiteInfo,Model model) {
	  return WebsiteInfoService.selectWebsiteInfoByID(WebsiteInfo,model);
  }
  @RequestMapping("/updateWebsiteInfo")
  public String updateWebsiteInfo(WebsiteInfo WebsiteInfo,Model model,HttpSession session) {
	  return WebsiteInfoService.updateWebsiteInfo(WebsiteInfo,model,session);
  }
}
