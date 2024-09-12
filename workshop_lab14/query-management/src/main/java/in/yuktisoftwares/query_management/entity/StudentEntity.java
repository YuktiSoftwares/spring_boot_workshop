package in.yuktisoftwares.query_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name="student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_student_id_seq_name")
	@SequenceGenerator(name = "student_student_id_seq_name", sequenceName = "student_student_id_seq", allocationSize = 1)	
	private Integer id;
	private String name;
	private  String emailId;
	private String Mobile;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", emailId=" + emailId + ", Mobile=" + Mobile + "]";
	}
	
	
}
