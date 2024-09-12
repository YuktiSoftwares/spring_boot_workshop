package in.yuktisoftwares.query_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {

    @GetMapping("query")
    public String query(){
        return "What is Spring Boot?";
    }
}
