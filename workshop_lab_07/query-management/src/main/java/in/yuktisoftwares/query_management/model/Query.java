package in.yuktisoftwares.query_management.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Query {

    private Integer id;
    private String description;
    private String status;
    private String response;
    private Integer studentId;

}
