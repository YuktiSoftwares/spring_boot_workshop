package in.yuktisoftwares.query_management.service;

import in.yuktisoftwares.query_management.model.Query;
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
