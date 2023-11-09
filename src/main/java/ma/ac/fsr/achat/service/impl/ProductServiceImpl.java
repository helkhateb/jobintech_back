package ma.ac.fsr.achat.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.ProductDto;
import ma.ac.fsr.achat.mapper.ProductMapper;
import ma.ac.fsr.achat.repository.ProductRepository;
import ma.ac.fsr.achat.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public List<ProductDto> findAll() {
        return mapper.entityToDto(repository.findAll());
    }
}
