package cn.qiuhen.domain;

/**
 * 
 * @author kangjian
 *
 */
public class User {
    private Long id;
    private String account;     //账号
    private String username;    //用户名
    private String password;    //密码
    private String sign;        //签名
    private String head_image;  //头像
    private String sex;         //性别
    private String city;        //城市
    private String classify;    //职业
    private boolean isDisabled; //起禁用
    private int page;           //当前页
    private int limit;          //显示条数
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getHead_image() {
		return head_image;
	}
	public void setHead_image(String head_image) {
		this.head_image = head_image;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}
	public boolean isDisabled() {
		return isDisabled;
	}
	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}

}
