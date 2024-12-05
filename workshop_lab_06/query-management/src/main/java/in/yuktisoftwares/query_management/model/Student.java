package in.yuktisoftwares.query_management.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {

    private Integer id;
    private String name;
    private String email;
    private String mobile;


}
