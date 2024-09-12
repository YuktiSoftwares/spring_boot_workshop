package in.yuktisoftwares.query_management.model;

public class Query {

	private int id;
	private String description;
	private String response;
	private String status;
	private int studentId;
	private String name;
	private  String emailId;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		System.out.println(this.getDescription());
		System.out.println(this.getResponse());
		System.out.println(this.getStatus());
		System.out.println(this.getStudentId());
	}
	@Override
	public String toString() {
		return "Query [id=" + id + ", description=" + description + ", response=" + response + ", status=" + status
				+ ", studentId=" + studentId + ", name=" + name + ", emailId=" + emailId + ", mobile=" + mobile + "]";
	}
	
	
}
