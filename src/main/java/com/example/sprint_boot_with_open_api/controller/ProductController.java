package com.example.sprint_boot_with_open_api.controller;

import com.example.sprint_boot_with_open_api.entities.Product;
import com.example.sprint_boot_with_open_api.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
@Tag(name = "Product ")
public class ProductController {

    private final ProductService productService;

    @Operation(
            description = "Get endpoint for product",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized ",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping
    public List<Product> getProducts(){
        return  productService.getALlProduct();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id){
        return  productService.getProductById(id);
    }

    @PostMapping
    public Product addNewProduct(@RequestBody Product newProduct){
        return  productService.addProduct(newProduct);
    }

    @PutMapping("/{id}")
    public Product editProduct(@RequestBody Product product, @PathVariable long id){
        return productService.editProduct(product,id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable long id){
        return  productService.deleteProduct(id);
    }

}
