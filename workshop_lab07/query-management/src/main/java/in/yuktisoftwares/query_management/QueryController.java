package in.yuktisoftwares.query_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/queries")
public class QueryController {

    @GetMapping
    public List<Query> getQueries() {

        List<Query> queries = new ArrayList<>();
        Query query1 = Query.builder().id(101).description("what is Java?").studentId(1001).status("OPEN").build();
        Query query2 = Query.builder().id(102).description("what is Python?").studentId(1001).status("OPEN").build();
        queries.add(query1);
        queries.add(query2);
        return queries;
    }


}
