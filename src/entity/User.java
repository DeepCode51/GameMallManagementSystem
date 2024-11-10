package entity;
import java.io.Serializable;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int uid;
	@NotBlank(message="{loginaccount.required}")
	private String loginaccount;
	@NotBlank(message="{password.required}")
	@Length(min=6,max=10,message="{password.invalid}")
	private String password;
	@NotBlank(message="{fullname.required}")
	private String fullname;
	@NotBlank(message="{tel.required}")
	private String tel; 
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getLoginaccount() {
		return loginaccount;
	}
	public void setLoginaccount(String loginaccount) {
		this.loginaccount = loginaccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
