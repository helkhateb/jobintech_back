package ma.ac.fsr.achat.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.ProductDto;
import ma.ac.fsr.achat.service.IProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {

    private final IProductService service;

    @GetMapping("/")
    public List<ProductDto> findAll(){
        return service.findAll();
    }

}
