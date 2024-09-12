package in.yuktisoftwares.query_management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

}
