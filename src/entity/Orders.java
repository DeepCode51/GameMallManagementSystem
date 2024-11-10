package entity;
public class  Orders{
  private int oid;
  private String orderstate;
  private String jewelryinfo;
  private String buydate;
  private String userinfo;
    public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public String getJewelryinfo() {
		return jewelryinfo;
	}
	public void setJewelryinfo(String jewelryinfo) {
		this.jewelryinfo = jewelryinfo;
	}
	public String getBuydate() {
		return buydate;
	}
	public void setBuydate(String buydate) {
		this.buydate = buydate;
	}
	public String getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(String userinfo) {
		this.userinfo = userinfo;
	}
}