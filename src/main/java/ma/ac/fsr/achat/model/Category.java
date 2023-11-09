package ma.ac.fsr.achat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CATEGORY")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Category extends BaseEntity{
    @Column(name= "LABEL")
    private String label;
}
