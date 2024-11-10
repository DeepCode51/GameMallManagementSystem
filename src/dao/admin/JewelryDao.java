package dao.admin;
import java.util.List;
import entity.Jewelry;
public interface JewelryDao {
	public int add(Jewelry Jewelry);
	public List<Jewelry> selectJewelry();
	public int deleteJewelry(Jewelry Jewelry);
	public Jewelry selectJewelryByID(int aid);
	public int updateJewelry(Jewelry Jewelry);
	public int updateJewelry1(Jewelry Jewelry);
	public List<Jewelry> selectJewelryByFname(String aname);
	public List<Jewelry> selectJewelryBySname(String sname);
	public List<Jewelry> getJewelryByPage(int startindex);
	

	

	

	

	

	

	

	
}
