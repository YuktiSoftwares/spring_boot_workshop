package in.yuktisoftwares.query_management.controller;

import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void saveStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        System.out.println("Saved Student: " + savedStudent);
    }


}
