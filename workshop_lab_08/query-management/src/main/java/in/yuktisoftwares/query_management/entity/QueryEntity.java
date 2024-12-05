package in.yuktisoftwares.query_management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "query")
public class QueryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "query_id_sequence_name")
    @SequenceGenerator(name = "query_id_sequence_name", sequenceName = "query_id_seq", allocationSize = 1)
    private Integer id;
    private String description;
    private String status;
    private String response;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId")
    private StudentEntity student;
}
