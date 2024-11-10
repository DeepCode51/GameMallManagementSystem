package entity;
import org.springframework.web.multipart.MultipartFile;
public class Jewelry {
  private int jid;
  private String jname;
  private float jewelry_price;
  private int jewelry_store;
  private int jewelry_sale;
  private String images;
  private MultipartFile  imgurl;
  private String fname;
  private int fid;
  private String condition;//成色
  private String service;//发行日期
public int getJid() {
	return jid;
}
public void setJid(int jid) {
	this.jid = jid;
}
public String getJname() {
	return jname;
}
public void setJname(String jname) {
	this.jname = jname;
}
public float getJewelry_price() {
	return jewelry_price;
}
public void setJewelry_price(float jewelry_price) {
	this.jewelry_price = jewelry_price;
}
public int getJewelry_store() {
	return jewelry_store;
}
public void setJewelry_store(int jewelry_store) {
	this.jewelry_store = jewelry_store;
}
public int getJewelry_sale() {
	return jewelry_sale;
}
public void setJewelry_sale(int jewelry_sale) {
	this.jewelry_sale = jewelry_sale;
}
public String getImages() {
	return images;
}
public void setImages(String images) {
	this.images = images;
}
public MultipartFile getImgurl() {
	return imgurl;
}
public void setImgurl(MultipartFile imgurl) {
	this.imgurl = imgurl;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getCondition() {
	return condition;
}
public void setCondition(String condition) {
	this.condition = condition;
}
public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
}
