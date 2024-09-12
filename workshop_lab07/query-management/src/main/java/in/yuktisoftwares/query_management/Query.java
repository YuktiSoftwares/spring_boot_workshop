package in.yuktisoftwares.query_management;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Query {

    private Integer id;
    private String description;
    private String response;
    private String status;

    private Integer studentId;
    private String name;
    private  String email;
    private String mobile;


}
