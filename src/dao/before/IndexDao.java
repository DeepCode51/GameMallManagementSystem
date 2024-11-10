package dao.before;
import java.util.List;
import entity.Jewelry;
public interface IndexDao {
	public List<Jewelry> selectJewelry();
	public Jewelry selectJewelryByID(int aid);
	public List<Jewelry> selectJewelryByFname(String fname);
	public List<Jewelry> selectJewelryByJname(String jname);
	public void updateJewelry1(Jewelry Jewelry);
	public List<Jewelry> selectJewelry3();
}
