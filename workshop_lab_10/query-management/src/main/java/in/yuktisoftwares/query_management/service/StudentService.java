package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student saveStudent(Student student);

    Student updateStudent(Integer id, Student student);

}
