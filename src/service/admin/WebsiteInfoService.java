package service.admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import entity.WebsiteInfo;
public interface WebsiteInfoService {
	public String add(WebsiteInfo WebsiteInfo, Model model, HttpServletRequest req);
	public String selectWebsiteInfo(Model model);
	public String deleteWebsiteInfo(WebsiteInfo WebsiteInfo, Model model);
	public String selectWebsiteInfo1(Model model);
	public String updateWebsiteInfo(WebsiteInfo WebsiteInfo, Model model, HttpSession session);
	public String selectWebsiteInfoByID(WebsiteInfo WebsiteInfo, Model model);
	public String selectWebsiteInfoByID1(WebsiteInfo websiteInfo, Model model);
}
