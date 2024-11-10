package service.before;
import org.springframework.ui.Model;
import entity.Jewelry;
public interface IndexService {
	public String selectJewelryByJname(Model model, String Jname);
	public String selectJewelryByID(Jewelry Jewelry, Model model);
	public String selectJewelryByID1(Jewelry Jewelry, Model model);
	public String selectJewelry2(Model model);
	public String selectJewelryByFname(Model model, String fname);
	public String selectJewelry3(Model model);
	public String selectJewelry4(Model model);
}
