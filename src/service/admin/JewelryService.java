package service.admin;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import entity.Jewelry;
public interface JewelryService {
	public String add(Jewelry Jewelry, Model model, HttpServletRequest req);
	public String selectJewelry(Model model, Integer pageCur);
	public String deleteJewelry(Jewelry Jewelry, Model model);
	public String selectJewelry1(Model model);
	public String updateJewelry(Jewelry Jewelry, Model model, HttpSession session);
	public String selectJewelryByID(Jewelry Jewelry, Model model);
}
