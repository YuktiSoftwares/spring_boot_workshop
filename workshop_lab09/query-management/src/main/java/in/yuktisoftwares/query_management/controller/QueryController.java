package in.yuktisoftwares.query_management.controller;

import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.service.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/queries")
public class QueryController {

    @Autowired
    private QueryServiceImpl queryService;
    @GetMapping
    public List<Query> getQueries() {
        return queryService.getQueries();
    }


}
