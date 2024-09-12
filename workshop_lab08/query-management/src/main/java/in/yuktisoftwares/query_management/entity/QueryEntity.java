package in.yuktisoftwares.query_management.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "query")
public class QueryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "query_id_sequence_name")
    @SequenceGenerator(name = "query_id_sequence_name", sequenceName = "query_id_sequence")
    private Integer id;
    private String description;
    private String response;
    private String status;

}
