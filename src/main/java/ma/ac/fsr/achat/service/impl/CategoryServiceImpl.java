package ma.ac.fsr.achat.service.impl;

import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.CategoryDto;
import ma.ac.fsr.achat.mapper.CategoryMapper;
import ma.ac.fsr.achat.repository.CategoryRepository;
import ma.ac.fsr.achat.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements ICategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;

    @Override
    public List<CategoryDto> findAll() {
        return mapper.entityToDto(repository.findAll());
    }
}
