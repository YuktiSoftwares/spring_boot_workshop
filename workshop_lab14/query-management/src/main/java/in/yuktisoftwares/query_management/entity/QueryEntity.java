package in.yuktisoftwares.query_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name="query")
public class QueryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "query_query_id_seq_name")
	@SequenceGenerator(name = "query_query_id_seq_name", sequenceName = "query_query_id_seq", allocationSize = 1)	
	private Integer id;
	private String description;
	private String response;
	private String status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "studentId")
	private StudentEntity student;
	
	//private Integer studentId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public StudentEntity getStudent() {
		return student;
	}
	public void setStudent(StudentEntity student) {
		this.student = student;
	}
	
	
}
