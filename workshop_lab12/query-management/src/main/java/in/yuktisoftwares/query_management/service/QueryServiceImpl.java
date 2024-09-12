package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.entity.QueryEntity;
import in.yuktisoftwares.query_management.entity.StudentEntity;
import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.repository.QueryRepository;
import in.yuktisoftwares.query_management.repository.StudentRepository;
import in.yuktisoftwares.query_management.utils.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl {

    @Autowired
    private QueryRepository queryRepository;
    @Autowired
    private StudentRepository studentRepository;

    public List<Query> getQueries() {
        List<QueryEntity> queryEntities = (List<QueryEntity>) queryRepository.findAll();

        return queryEntities.stream().map(Utilities::getQueryModelFromQueryEntity).toList();


    }

    public Query saveQuery(Query query) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(query.getName());
        studentEntity.setEmail(query.getEmail());
        studentEntity.setMobile(query.getMobile());

        studentEntity = studentRepository.save(studentEntity);
        System.out.println("StudentEntity has been save to database:"+studentEntity);

        QueryEntity queryEntity = Utilities.getQueryEntityFromQueryModel(query);
        queryEntity.setStudent(studentEntity);
        queryRepository.save(queryEntity);
        System.out.println("QueryEntity has been save to database:"+queryEntity);
        return Utilities.getQueryModelFromQueryEntity(queryEntity);


    }


}
