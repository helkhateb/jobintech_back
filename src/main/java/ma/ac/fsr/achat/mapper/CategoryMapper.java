package ma.ac.fsr.achat.mapper;

import ma.ac.fsr.achat.dto.CategoryDto;
import ma.ac.fsr.achat.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class );
    CategoryDto entityToDto(Category entity);
    Category dtoToEntity(CategoryDto dto);
    List<CategoryDto> entityToDto(List<Category> entity);
    List<Category> dtoToEntity(List<CategoryDto> dto);
}
