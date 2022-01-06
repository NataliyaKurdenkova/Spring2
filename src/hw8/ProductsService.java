package com.geekbrains.gbrestdemo.services;


import com.geekbrains.gbrestdemo.entities.Product;
import com.geekbrains.gbrestdemo.repositories.ProductsRepository;

import com.geekbrains.gbrestdemo.utils.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;




    // get
    public Product getProductById(Long id) {
        Optional<Product> product= productsRepository.findById(id);
        if (!product.isPresent()) {
            throw new ProductNotFoundException("Product with id = " + id + " not found");
        }
        return product.get();
    }

    // post put
    public Product saveOrUpdate(Product product) {
        return productsRepository.save(product);
    }

    // delete
    public void delete(Long id) {
        Optional<Product> product = productsRepository.findById(id);
        if (!product.isPresent()) {
            throw new ProductNotFoundException("Product with id = " + id + " not found");
        }
        productsRepository.delete(product.get());
    }

    // get
    public List<Product> getAllProductsList() {
        return (List<Product>) productsRepository.findAll();
    }

    public ProductsRepository getProductsRepository() {
        return productsRepository;
    }


    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
}
