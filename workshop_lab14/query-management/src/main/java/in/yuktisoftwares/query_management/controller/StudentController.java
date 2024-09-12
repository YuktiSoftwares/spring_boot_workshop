package in.yuktisoftwares.query_management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.service.StudentService;
import in.yuktisoftwares.query_management.service.StudentServiceImpl;



@RequestMapping("/students")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@GetMapping
	public List getStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping
	public void saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
}
