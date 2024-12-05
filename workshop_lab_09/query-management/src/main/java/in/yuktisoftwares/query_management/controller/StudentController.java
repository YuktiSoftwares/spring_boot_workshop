package in.yuktisoftwares.query_management.controller;

import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getStudents(){
        List<Student> students = studentService.getStudents();
        System.out.println(students);

        return students;

    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
            Student savedStudent = studentService.saveStudent(student);
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody Student student){
            Student savedStudent = studentService.updateStudent(id, student);
            return new ResponseEntity<>(savedStudent, HttpStatus.OK);

    }

}
