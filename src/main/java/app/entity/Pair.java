package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class Pair {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pair_pair_id_seq")
    @SequenceGenerator(
            name = "pair_pair_id_seq",
            sequenceName = "pair_pair_id_seq",
            allocationSize = 1
    )
    @Column(name = "pair_id")
    @JsonIgnore
    private int pairId;
    @JsonIgnore
    private int staffId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rolee_id")
    private Rolee rolee;
}
