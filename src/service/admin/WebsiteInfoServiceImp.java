package service.admin;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import dao.admin.FormsDao;
import dao.admin.WebsiteInfoDao;
import entity.Forms;
import entity.WebsiteInfo;
@Service("WebsiteInfoService")
public class WebsiteInfoServiceImp implements WebsiteInfoService{
   @Autowired
   private WebsiteInfoDao WebsiteInfoDao;
   @Autowired
   private FormsDao formsDao;
@Override
public String add(WebsiteInfo WebsiteInfo, Model model, HttpServletRequest req) {
	if(WebsiteInfo.getImgurl()==null) {
		model.addAttribute("errorMessage", "请选择图片！");
		return "admin/iframes";
	}
	String path = req.getServletContext().getRealPath("/static/");
	path=path+"images/";
	MultipartFile mtf = (MultipartFile) WebsiteInfo.getImgurl();
	if(mtf.getOriginalFilename().length() > 0) {
		String oldName = mtf.getOriginalFilename();
		WebsiteInfo.setInfo_img(oldName);
		System.out.println(path);
		File filePath = new File(path + oldName);
		//如果文件目录不存在，创建目录
		if(!filePath.getParentFile().exists()) {
			filePath.getParentFile().mkdirs();
		}
		//上传图片
		try {
			mtf.transferTo(filePath);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	WebsiteInfoDao.add(WebsiteInfo);
	model.addAttribute("mess", "添加成功！");
	return "forward:selectWebsiteInfo";
}
@Override
public String selectWebsiteInfo(Model model) {
	// TODO Auto-generated method stub
	List<WebsiteInfo> list=WebsiteInfoDao.selectWebsiteInfo();
	model.addAttribute("list",list);
	return "admin/showWebsiteInfo";
}
@Override
public String deleteWebsiteInfo(WebsiteInfo WebsiteInfo, Model model) {
	// TODO Auto-generated method stub
	   WebsiteInfoDao.deleteWebsiteInfo(WebsiteInfo);
	   return "forward:selectWebsiteInfo";
}
public String selectWebsiteInfoByID(WebsiteInfo WebsiteInfo, Model model) {
	// TODO Auto-generated method stub
	WebsiteInfo WebsiteInfo1=WebsiteInfoDao.selectWebsiteInfoByID(WebsiteInfo.getWid());
	model.addAttribute("WebsiteInfo",WebsiteInfo1);
	List<Forms> list=formsDao.selectForms();
	model.addAttribute("list", list);
	return "admin/WebsiteInfoDetails";

}
@Override
public String updateWebsiteInfo(WebsiteInfo WebsiteInfo, Model model, HttpSession session) {
	// TODO Auto-generated method stub
	int i=WebsiteInfoDao.updateWebsiteInfo(WebsiteInfo);
	if(i>0) {
		 return "forward:selectWebsiteInfo";
	}else {
		return "admin/error";
	}
}
@Override
public String selectWebsiteInfo1(Model model) {
	// TODO Auto-generated method stub
	List<WebsiteInfo> list=WebsiteInfoDao.selectWebsiteInfo();
	model.addAttribute("list",list);
	return "user/showWebsiteInfo";
}
public String selectWebsiteInfoByID1(WebsiteInfo WebsiteInfo, Model model) {
	// TODO Auto-generated method stub
	WebsiteInfo WebsiteInfo1=WebsiteInfoDao.selectWebsiteInfoByID(WebsiteInfo.getWid());
	model.addAttribute("WebsiteInfo",WebsiteInfo1);
	return "user/WebsiteInfoDetails";
}
}
