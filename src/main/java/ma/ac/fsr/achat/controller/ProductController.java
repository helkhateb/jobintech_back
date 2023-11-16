package ma.ac.fsr.achat.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ma.ac.fsr.achat.dto.ProductDto;
import ma.ac.fsr.achat.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@Tag(name = "Product", description = "REST API for Product information")
public class ProductController {

    private final IProductService service;

    @GetMapping("/")
    @Operation(
            summary = "Product Get List",
            description = "Product Get List")
    @ApiResponse(
            responseCode = "200",
            description = "200 IS OK")
    public List<ProductDto> findAll(){
        return service.findAll();
    }

    @Operation(summary = "Save Product",
            description = "Save Product")
    @ApiResponse(
            responseCode = "201",
            description = "201 IS OK")
    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProductDto save(@Valid @RequestBody ProductDto dto) {
        return service.save(dto);
    }
}
