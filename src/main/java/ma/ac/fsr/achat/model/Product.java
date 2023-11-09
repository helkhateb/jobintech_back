package ma.ac.fsr.achat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Product extends BaseEntity{

    @Column(name="DESIGNATION", length = 50)
    private String designation;

    @Column(name="PRICE")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "FK_PRODUCT_CATEGORY"))
    private Category category;
}
