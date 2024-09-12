package in.yuktisoftwares.query_management.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Student {
    private Integer id;
    private String name;
    private  String email;
    private String mobile;

}
