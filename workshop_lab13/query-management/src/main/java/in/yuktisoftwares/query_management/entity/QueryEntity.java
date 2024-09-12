package in.yuktisoftwares.query_management.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "query")
public class QueryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "query_id_sequence_name")
    @SequenceGenerator(name = "query_id_sequence_name", sequenceName = "query_id_sequence")
    private Integer id;
    private String description;
    private String response;
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId")
    private StudentEntity student;

}
