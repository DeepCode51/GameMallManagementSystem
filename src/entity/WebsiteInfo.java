package entity;
import java.sql.Date;
import org.springframework.web.multipart.MultipartFile;
public class WebsiteInfo {
  private int wid;
  private String info_name;
  private String info_detail;
  private String info_img;
  private MultipartFile  imgurl;
  private Date  info_date;
public int getWid() {
	return wid;
}
public void setWid(int wid) {
	this.wid = wid;
}
public String getInfo_name() {
	return info_name;
}
public void setInfo_name(String info_name) {
	this.info_name = info_name;
}
public String getInfo_detail() {
	return info_detail;
}
public void setInfo_detail(String info_detail) {
	this.info_detail = info_detail;
}
public String getInfo_img() {
	return info_img;
}
public void setInfo_img(String info_img) {
	this.info_img = info_img;
}
public MultipartFile getImgurl() {
	return imgurl;
}
public void setImgurl(MultipartFile imgurl) {
	this.imgurl = imgurl;
}
public Date getInfo_date() {
	return info_date;
}
public void setInfo_date(Date info_date) {
	this.info_date = info_date;
}
  
}