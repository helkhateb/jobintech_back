package ma.ac.fsr.achat.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.ProductDto;
import ma.ac.fsr.achat.mapper.ProductMapper;
import ma.ac.fsr.achat.model.Category;
import ma.ac.fsr.achat.model.Product;
import ma.ac.fsr.achat.repository.CategoryRepository;
import ma.ac.fsr.achat.repository.ProductRepository;
import ma.ac.fsr.achat.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final ProductRepository repository;
    private final CategoryRepository categoryRepository;
    private final ProductMapper mapper;

    @Override
    public List<ProductDto> findAll() {
        return mapper.entityToDto(repository.findAll());
    }

    @Override
    public ProductDto save(ProductDto dto) {
        Product p = mapper.dtoToEntity(dto);
        if(dto.getCategory()!=null) {
            Optional<Category> c = categoryRepository.findById(dto.getCategory().getId());
            c.ifPresent(p::setCategory);
        }
        return mapper.entityToDto(repository.save(p));
    }
}
