package in.yuktisoftwares.query_management.repository;

import in.yuktisoftwares.query_management.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
}
