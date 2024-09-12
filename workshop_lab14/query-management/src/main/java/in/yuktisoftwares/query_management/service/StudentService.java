package in.yuktisoftwares.query_management.service;

import java.util.List;

import in.yuktisoftwares.query_management.model.Student;

public interface StudentService {
	public List<Student> getStudents();
	public void saveStudent(Student student);
}
