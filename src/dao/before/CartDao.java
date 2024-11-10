package dao.before;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import entity.Cart;
public interface CartDao {
	public void add(Cart cart);
	public  List<Map<String, Object>> selectCart(int uid);
	public  List<Map<String, Object>> selectCart1(int uid);
	public  int deleteCart(Cart cart);
	public  int updateCart1(int uid);
}
