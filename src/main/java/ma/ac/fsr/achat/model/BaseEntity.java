package ma.ac.fsr.achat.model;

import jakarta.persistence.*;
import lombok.Getter;


@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    protected Integer id;
}
