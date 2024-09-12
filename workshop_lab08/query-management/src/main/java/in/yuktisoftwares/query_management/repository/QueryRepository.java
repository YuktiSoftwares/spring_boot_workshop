package in.yuktisoftwares.query_management.repository;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends CrudRepository<QueryEntity, Integer> {
}
