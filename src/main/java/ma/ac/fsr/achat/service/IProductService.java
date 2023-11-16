package ma.ac.fsr.achat.service;

import ma.ac.fsr.achat.dto.ProductDto;

import java.util.List;

public interface IProductService {
    public List<ProductDto> findAll();
    public ProductDto save(ProductDto dto);
}
