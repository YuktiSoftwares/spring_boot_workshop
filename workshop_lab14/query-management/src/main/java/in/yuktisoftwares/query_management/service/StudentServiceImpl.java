package in.yuktisoftwares.query_management.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> getStudents(){
	
		 List<StudentEntity> studentEntities = ( List<StudentEntity>)studentRepository.findAll();
		 ArrayList<Student> students = new ArrayList<Student>();
		 for(int i=0;i<studentEntities.size();i++) {
			 StudentEntity studentEntity = (StudentEntity)studentEntities.get(i);
			 
			 Student student = new Student();
			 student.setId(studentEntity.getId());
			 student.setName(studentEntity.getName());
			 student.setEmailId(studentEntity.getEmailId());
			 student.setMobile(studentEntity.getMobile());
			 students.add(student);
		 }
		 
		 
		return students;
	};
	
	@Override
	public void saveStudent(Student student){
		 StudentEntity studentEntity = new StudentEntity();
		 studentEntity.setId(student.getId());
		 studentEntity.setName(student.getName());
		 studentEntity.setEmailId(student.getEmailId());
		 studentEntity.setMobile(student.getMobile());
		 studentRepository.save(studentEntity);
		 System.out.println("StudentEntity has been save to database:"+studentEntity);
	}
}
