package ma.ac.fsr.achat.mapper;

import ma.ac.fsr.achat.dto.ProductDto;
import ma.ac.fsr.achat.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class );
    @Mapping(target = "label", source = "entity.designation")
    ProductDto entityToDto(Product entity);
    @InheritInverseConfiguration(name = "entityToDto")
    Product dtoToEntity(ProductDto dto);
    List<ProductDto> entityToDto(List<Product> entity);
    List<Product> dtoToEntity(List<ProductDto> dto);

    @Mapping(target = "designation", source = "dto.label")
    void forUpdateDtoToEntity(@MappingTarget Product entity, ProductDto dto);

    @InheritInverseConfiguration(name = "forUpdateDtoToEntity")
    void forUpdateEntitytoDto(@MappingTarget ProductDto dto, Product entity);
}
