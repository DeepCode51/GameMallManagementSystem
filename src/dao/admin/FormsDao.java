package dao.admin;
import java.util.List;
import java.util.Map;
import entity.Forms;
public interface FormsDao {

  public int add(Forms Forms);

  public List<Forms> selectForms();

  public int deleteForms(int fid);

}
