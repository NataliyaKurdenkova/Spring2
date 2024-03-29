package com.geekbrains.gbrestdemo.repositories;


import com.geekbrains.gbrestdemo.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Product, Long> {
}
