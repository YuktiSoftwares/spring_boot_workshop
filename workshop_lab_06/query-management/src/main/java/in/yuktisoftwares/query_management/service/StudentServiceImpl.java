package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setId(101);
        student.setName("Abc");
        student.setEmail("abc@gmail.com");
        student.setMobile("+91 9876543210");
        studentList.add(student);

        Student student2 = new Student();
        student2.setId(102);
        student2.setName("Abc2");
        student2.setEmail("abc2@gmail.com");
        student2.setMobile("+91 9876543210");
        studentList.add(student2);
        return studentList;
    }
}
