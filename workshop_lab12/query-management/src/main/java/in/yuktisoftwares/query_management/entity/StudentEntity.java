package in.yuktisoftwares.query_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_sequence_name")
    @SequenceGenerator(name = "student_id_sequence_name", sequenceName = "student_id_sequence")
    private Integer id;
    private String name;
    private  String email;
    private String mobile;

}
