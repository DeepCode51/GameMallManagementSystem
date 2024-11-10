package dao.admin;
import java.util.List;
import entity.WebsiteInfo;
public interface WebsiteInfoDao {
	public int add(WebsiteInfo WebsiteInfo);
	public List<WebsiteInfo> selectWebsiteInfo();
	public int deleteWebsiteInfo(WebsiteInfo WebsiteInfo);
	public WebsiteInfo selectWebsiteInfoByID(int aid);
	public int updateWebsiteInfo(WebsiteInfo WebsiteInfo);
	
	

	

	

	

	

	

	

	
}
