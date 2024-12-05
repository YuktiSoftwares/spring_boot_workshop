package in.yuktisoftwares.query_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("query")
public class QueryController {


    @GetMapping
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
