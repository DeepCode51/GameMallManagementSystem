package service.before;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import dao.admin.FormsDao;
import dao.before.IndexDao;
import entity.Forms;
import entity.Jewelry;
@Service
public class IndexServiceImp implements IndexService{
   @Autowired
   private IndexDao IndexDao;
   @Autowired
   private FormsDao formsDao;
public String selectJewelryByID(Jewelry Jewelry, Model model) {
	// TODO Auto-generated method stub
	Jewelry Jewelry1=IndexDao.selectJewelryByID(Jewelry.getJid());
	model.addAttribute("Jewelry",Jewelry1);
	List<Forms> list=formsDao.selectForms();
	model.addAttribute("list", list);
	return "admin/JewelryDetails";

}
@Override
public String selectJewelry2(Model model) {
	// TODO Auto-generated method stub
	List<Jewelry> list=IndexDao.selectJewelry();
	model.addAttribute("list",list);
	return "user/showJewelry";
}
public String selectJewelryByID1(Jewelry Jewelry, Model model) {
	// TODO Auto-generated method stub
	Jewelry Jewelry1=IndexDao.selectJewelryByID(Jewelry.getJid());
	model.addAttribute("Jewelry",Jewelry1);
	return "user/JewelryDetails2";

}
@Override
public String selectJewelryByJname(Model model, String Jname) {
	// TODO Auto-generated method stub
	 List<Jewelry> list=IndexDao.selectJewelryByJname(Jname);
	model.addAttribute("list",list);
	model.addAttribute("Jname",Jname);
	return "user/showJewelry";
}
@Override
public String selectJewelryByFname(Model model, String fname) {
	// TODO Auto-generated method stub
	    List<Jewelry> list=IndexDao.selectJewelryByFname(fname);
		model.addAttribute("list",list);
		List<Forms> list1=formsDao.selectForms();
		model.addAttribute("list1", list1);
		return "user/showJewelry4";
}
//销量搜索
@Override
public String selectJewelry3(Model model) {
	// TODO Auto-generated method stub
	List<Jewelry> list=IndexDao.selectJewelry3();
	model.addAttribute("list",list);
	return "user/showJewelry3";
}
//游戏类型搜索
@Override
public String selectJewelry4(Model model) {
	// TODO Auto-generated method stub
	List<Jewelry> list=IndexDao.selectJewelry();
	model.addAttribute("list",list);
	List<Forms> list1=formsDao.selectForms();
	model.addAttribute("list1", list1);
	return "user/showJewelry4";
}
}
