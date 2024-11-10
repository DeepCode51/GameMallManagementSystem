package dao.before;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import entity.Admin;
import entity.User;
@Repository("UserDao")
@Mapper
public interface UserDao{ 
	public List<User> login(User u);
	public int  addUser(User u); 
	public int updateUser(User u);
	public int deleteUser(int uid);
	public List<User> selectUser();

	
}
