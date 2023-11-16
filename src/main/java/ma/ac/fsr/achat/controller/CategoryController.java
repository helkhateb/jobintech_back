package ma.ac.fsr.achat.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Category", description = "REST API for Category information")
public class CategoryController {

    private final ICategoryService service;

    @GetMapping("/")
    @Operation(
            summary = "Category Get List",
            description = "Category Get List")
    @ApiResponse(
            responseCode = "200",
            description = "200 IS OK")
    public List<CategoryDto> findAll(){
        return service.findAll();
    }

}
