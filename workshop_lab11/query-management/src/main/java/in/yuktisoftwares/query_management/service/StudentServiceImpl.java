package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<StudentEntity> studentEntities = (List<StudentEntity>) studentRepository.findAll();

        return studentEntities.stream().map(this::getStudentModelFromStudentEntity).toList();


    }

    public Student saveStudent(Student student) {
        StudentEntity studentEntity = getStudentEntityFromStudentModel(student);
        studentRepository.save(studentEntity);
        return getStudentModelFromStudentEntity(studentEntity);


    }

    private StudentEntity getStudentEntityFromStudentModel(Student model) {
        return StudentEntity.builder().id(model.getId()).name(model.getName())
                .email(model.getEmail()).mobile(model.getMobile()).build();
    }

    private Student getStudentModelFromStudentEntity(StudentEntity entity) {
        return Student.builder().id(entity.getId()).name(entity.getName())
                .email(entity.getEmail()).mobile(entity.getMobile()).build();
    }
}
