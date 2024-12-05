package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getStudents(){

        List<StudentEntity> studentEntities = (List< StudentEntity>)studentRepository.findAll();
        List<Student> students = new ArrayList<>();
        studentEntities.forEach(entity -> {
            Student student = new Student();
            student.setId(entity.getId());
            student.setName(entity.getName());
            student.setEmail(entity.getEmail());
            student.setMobile(entity.getMobile());
            students.add(student);
        });

        return students;
    }
}
