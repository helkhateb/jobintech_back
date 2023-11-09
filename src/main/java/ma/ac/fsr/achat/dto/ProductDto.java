package ma.ac.fsr.achat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDto {
    private Integer id;

    private String label;

    private Double price;

    private CategoryDto category;
}
