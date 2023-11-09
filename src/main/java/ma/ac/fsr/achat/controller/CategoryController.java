package ma.ac.fsr.achat.controller;

import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.CategoryDto;
import ma.ac.fsr.achat.service.ICategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
@CrossOrigin("*")
public class CategoryController {

    private final ICategoryService service;

    @GetMapping("/")
    public List<CategoryDto> findAll(){
        return service.findAll();
    }

}
