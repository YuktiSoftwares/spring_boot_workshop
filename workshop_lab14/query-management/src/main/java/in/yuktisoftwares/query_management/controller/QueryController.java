package in.yuktisoftwares.query_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.yuktisoftwares.query_management.model.Query;
import in.yuktisoftwares.query_management.service.QueryService;



@RequestMapping("/queries")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QueryController {

	@Autowired
	private QueryService queryService;
	@GetMapping
	public List getQueries(){
		return queryService.getQueries();
	}
	
	@PostMapping
	public void saveQuery(@RequestBody Query query) {
		System.out.println(query);
		queryService.saveQuery(query);
	}
}
