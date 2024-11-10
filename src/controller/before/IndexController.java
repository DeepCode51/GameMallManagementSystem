package controller.before;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.Jewelry;
import entity.WebsiteInfo;
import service.admin.WebsiteInfoService;
import service.before.IndexService;
@Controller
public class IndexController {
  @Autowired
  private IndexService IndexService;
  @Autowired
  private WebsiteInfoService WebsiteInfoService;
  @RequestMapping("/selectJewelryByID1")
  public String selectJewelryByID1(Jewelry Jewelry,Model model) {
	  return IndexService.selectJewelryByID1(Jewelry,model);
  }
  @RequestMapping("/selectJewelry2")
  public String selectJewelry2(Model model) {
	  return IndexService.selectJewelry2(model);
  }
  //销量搜索
  @RequestMapping("/selectJewelry3")
  public String selectJewelry3(Model model) {
	  return IndexService.selectJewelry3(model);
  }
  //游戏类型搜索
  @RequestMapping("/selectJewelry4")
  public String selectJewelry4(Model model) {
	  return IndexService.selectJewelry4(model);
  }
  @RequestMapping("/selectJewelryByJname")
  public String selectJewelryByJname(Model model,String jname) {
	  return IndexService.selectJewelryByJname(model,jname);
  }
  @RequestMapping("/selectJewelryByFname")
  public String selectJewelryByFname(Model model,String fname) {
	  return IndexService.selectJewelryByFname(model,fname);
  }
  
  @RequestMapping("/selectWebsiteInfo1")
  public String selectWebsiteInfo1(Model model) {
	  return WebsiteInfoService.selectWebsiteInfo1(model);
  }
  @RequestMapping("/selectWebsiteInfoByID1")
  public String selectWebsiteInfoByID1(Model model,WebsiteInfo WebsiteInfo) {
	  return WebsiteInfoService.selectWebsiteInfoByID1(WebsiteInfo,model);
  }
}
