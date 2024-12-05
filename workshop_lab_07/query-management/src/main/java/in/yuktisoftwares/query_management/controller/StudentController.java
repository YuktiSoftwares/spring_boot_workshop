package in.yuktisoftwares.query_management.controller;

import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("student")
public class StudentController {

    public final StudentService studentService;

    @GetMapping
    public List<Student> getStudents(){
        List<Student> studentList = studentService.getStudents();
        return studentList;
    }

}
