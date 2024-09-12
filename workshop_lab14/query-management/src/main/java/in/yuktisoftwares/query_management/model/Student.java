package in.yuktisoftwares.query_management.model;

public class Student {
	
	private int id;
	private String name;
	private  String emailId;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	void print(){
		System.out.println(this.getId());
		System.out.println(this.getName());
		System.out.println(this.getEmailId());
		System.out.println(this.getMobile());
	}
	
}
