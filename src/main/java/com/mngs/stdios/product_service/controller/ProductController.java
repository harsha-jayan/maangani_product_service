package com.mngs.stdios.product_service.controller;

import com.mngs.stdios.product_service.dto.CreateProductRequest;
import com.mngs.stdios.product_service.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(value = "/create", version = "1.0.0")
    public ResponseEntity<String> createProduct(@RequestBody CreateProductRequest createProductRequest){

        return ResponseEntity.ok().body("success");
    }

}
