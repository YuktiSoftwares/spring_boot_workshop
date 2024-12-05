package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.repository.QueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QueryServiceImpl implements QueryService{

    private final QueryRepository queryRepository;

    public List<Query> getQueries(){

        List<QueryEntity>queryEntities = (List<QueryEntity>)queryRepository.findAll();
        List<Query>queries = new ArrayList<>();
        queryEntities.forEach((entity)->{
            Query query = new Query();
            query.setId(entity.getId());
            query.setDescription(entity.getDescription());
            query.setResponse(entity.getResponse());
            query.setStatus(entity.getStatus());

            StudentEntity studentEntity = entity.getStudent();
            Student student = new Student();
            student.setId(studentEntity.getId());
            student.setName(studentEntity.getName());
            student.setEmail(studentEntity.getEmail());
            student.setMobile(studentEntity.getMobile());
            query.setStudent(student);
            queries.add(query);
        });

        return queries;
    }
}
