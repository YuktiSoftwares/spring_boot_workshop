package in.yuktisoftwares.query_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

	@GetMapping
	public String hello(){
		return "HelloWorld!!";
	}
}
