package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.repository.StudentRepository;
import in.yuktisoftwares.query_management.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<StudentEntity> studentEntities = (List<StudentEntity>) studentRepository.findAll();

        return studentEntities.stream().map(Utilities::getStudentModelFromStudentEntity).toList();


    }

    public Student saveStudent(Student student) {
        StudentEntity studentEntity = Utilities.getStudentEntityFromStudentModel(student);
        studentRepository.save(studentEntity);
        return Utilities.getStudentModelFromStudentEntity(studentEntity);


    }


}
