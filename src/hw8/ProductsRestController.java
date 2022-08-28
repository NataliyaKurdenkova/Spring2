package com.geekbrains.gbrestdemo.controllers;

import com.geekbrains.gbrestdemo.entities.Product;

import com.geekbrains.gbrestdemo.services.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/**")
@RestController
public class ProductsRestController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

//    @CrossOrigin
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productsService.getProductById(productId);
    }

    @GetMapping("/products")
    public List<Product> getProductById() {
        return productsService.getAllProductsList();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product theProduct) {
        theProduct.setId(0L);
        theProduct = productsService.saveOrUpdate(theProduct);
        return theProduct;
    }

    @PutMapping(path = "/products", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Product updateProduct(@RequestBody Product theProduct) {
        theProduct = productsService.saveOrUpdate(theProduct);
        return theProduct;
    }

    @DeleteMapping("/products/{productId}")
    public int deleteProduct(@PathVariable Long productId) {
        productsService.delete(productId);
        return HttpStatus.OK.value();
    }


}
