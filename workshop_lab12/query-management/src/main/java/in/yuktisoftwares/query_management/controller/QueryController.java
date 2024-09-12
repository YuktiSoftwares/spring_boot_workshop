package in.yuktisoftwares.query_management.controller;

import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.model.Student;
import in.yuktisoftwares.query_management.service.QueryServiceImpl;
import in.yuktisoftwares.query_management.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/queries")
@CrossOrigin(origins = "http://localhost:3000")
public class QueryController {

    @Autowired
    private QueryServiceImpl queryService;

    @GetMapping
    public List<Query> getQueries() {
        return queryService.getQueries();
    }

    @PostMapping
    public void saveQuery(@RequestBody Query query) {
        Query savedQuery = queryService.saveQuery(query);
        System.out.println("Saved Query: " + savedQuery);
    }


}
