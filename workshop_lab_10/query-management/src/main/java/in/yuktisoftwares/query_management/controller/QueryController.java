package in.yuktisoftwares.query_management.controller;

import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.service.QueryService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("query")
@RequiredArgsConstructor
public class QueryController {

    private final QueryService queryService;

    @GetMapping
    public List<Query> getQueries(){
        List<Query> queries = queryService.getQueries();
        System.out.println(queries);
        return queries;

    }

    @PostMapping
    public ResponseEntity<Query> saveQuery(@RequestBody Query query){
        Query savedQuery = queryService.saveQuery(query);
        return new ResponseEntity<>(savedQuery, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Query> updateQuery(@PathVariable Integer id, @RequestBody Query query){
        query.setId(id);
        Query updatedQuery = queryService.saveQuery(query);
        return new ResponseEntity<>(updatedQuery, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuery(@PathVariable Integer id){
        queryService.deleteQuery(id);
        return ResponseEntity.noContent().build();
    }
}
