package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
public class Rolee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rolee_rolee_id_seq")
    @SequenceGenerator(
            name = "rolee_rolee_id_seq",
            sequenceName = "rolee_rolee_id_seq",
            allocationSize = 1
    )
    @Column(name = "rolee_id")
    private int roleeId;
    private String rolee;
}
