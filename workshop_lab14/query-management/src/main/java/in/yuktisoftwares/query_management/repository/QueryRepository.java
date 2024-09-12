package in.yuktisoftwares.query_management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.yuktisoftwares.query_management.entity.QueryEntity;

@Repository
public interface QueryRepository extends CrudRepository<QueryEntity, Integer> {

}
