package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.model.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryServiceImpl implements QueryService{

    public List<Query> getQueries(){
        List<Query> queries = new ArrayList<>();
        Query query = new Query();
        query.setId(1001);
        query.setDescription("What is Spring Boot?");
        query.setStatus("OPEN");
        query.setStudentId(101);
        queries.add(query);
        return queries;
    }
}
