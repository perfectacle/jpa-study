package jpa.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }
}
