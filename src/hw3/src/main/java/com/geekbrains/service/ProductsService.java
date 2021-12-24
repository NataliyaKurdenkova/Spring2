package com.geekbrains.service;

import com.geekbrains.entites.Product;
import com.geekbrains.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;
    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product[] getfindAll(int kolvo) {

        return productsRepository.findAll(kolvo);
    }
    public Product getProduct(int id) {

        return productsRepository.newProduct(id);
    }

    public Product getfindByID(int id) {
        return productsRepository.findOneById(id);
    }

    public ProductsService() {

    }
}
