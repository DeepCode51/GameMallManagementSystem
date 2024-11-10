package service.admin;
import java.io.File;
import java.io.IOException;
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
import entity.Jewelry;
import util.MyUtil;
@Service("JewelryService")
public class JewelryServiceImp implements JewelryService{
   @Autowired
   private JewelryDao JewelryDao;
   @Autowired
   private FormsDao formsDao;
@Override
public String add(Jewelry Jewelry, Model model, HttpServletRequest req) {
	if(Jewelry.getImgurl()==null) {
		model.addAttribute("errorMessage", "请选择图片！");
		return "admin/iframes";
	}
	String path = req.getServletContext().getRealPath("/static/");
	path=path+"images/";
	MultipartFile mtf = (MultipartFile) Jewelry.getImgurl();
	if(mtf.getOriginalFilename().length() > 0) {
		String oldName = mtf.getOriginalFilename();
		Jewelry.setImages(oldName);
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
	
	JewelryDao.add(Jewelry);
	model.addAttribute("mess", "添加成功！");
	return "forward:selectJewelry?pageCur=1";
}
@Override
public String selectJewelry(Model model, Integer pageCur) {
	// TODO Auto-generated method stub
	List<Jewelry> list0=JewelryDao.selectJewelry();
	int length=list0.size();
	int totalPage=0;
	if(length%3==0) {
		totalPage=length/3;
	}else {
		totalPage=length/3+1;
	}
	int startindex=(pageCur-1)*3;
	List<Jewelry>list=JewelryDao.getJewelryByPage(startindex);
	model.addAttribute("list",list);
	model.addAttribute("totalPage",totalPage);
	model.addAttribute("pageCur",pageCur);
	return "admin/showJewelry";
}
@Override
public String deleteJewelry(Jewelry Jewelry, Model model) {
	// TODO Auto-generated method stub
	   JewelryDao.deleteJewelry(Jewelry);
	   return "forward:selectJewelry?pageCur=1";
}
@Override
public String selectJewelry1(Model model) {
	// TODO Auto-generated method stub
	List<Jewelry> list=JewelryDao.selectJewelry();
	model.addAttribute("list",list);
	return "admin/showJewelry1";
}
public String selectJewelryByID(Jewelry Jewelry, Model model) {
	// TODO Auto-generated method stub
	Jewelry Jewelry1=JewelryDao.selectJewelryByID(Jewelry.getJid());
	model.addAttribute("Jewelry",Jewelry1);
	List<Forms> list=formsDao.selectForms();
	model.addAttribute("list", list);
	return "admin/JewelryDetails";

}
@Override
public String updateJewelry(Jewelry Jewelry, Model model, HttpSession session) {
	// TODO Auto-generated method stub
	int i=JewelryDao.updateJewelry(Jewelry);
	if(i>0) {
		 return "forward:selectJewelry?pageCur=1";
	}else {
		return "admin/error";
	}
}
public String selectJewelryByID1(Jewelry Jewelry, Model model) {
	// TODO Auto-generated method stub
	Jewelry Jewelry1=JewelryDao.selectJewelryByID(Jewelry.getJid());
	model.addAttribute("Jewelry",Jewelry1);
	return "user/JewelryDetails2";
}
}
