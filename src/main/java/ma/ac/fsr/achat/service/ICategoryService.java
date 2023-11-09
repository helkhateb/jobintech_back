package ma.ac.fsr.achat.service;

import ma.ac.fsr.achat.dto.CategoryDto;
import ma.ac.fsr.achat.dto.ProductDto;

import java.util.List;

public interface ICategoryService {
    public List<CategoryDto> findAll();
}
