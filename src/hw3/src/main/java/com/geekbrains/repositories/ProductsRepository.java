package com.geekbrains.repositories;
/*
3. Товары необходимо хранить в репозитории (класс, в котором в виде List<Product> хранятся товары). Репозиторий должен уметь выдавать список всех товаров и товар по id;
 */

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Products;
import com.geekbrains.entites.Student;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
@Component
public class ProductsRepository {

   //создание продукта
    public Product newProduct(int id) {

        Product product=new Product(id,"Product "+id,id*5+2*id+12);

        return product;

    }
    //все товары
    public Product[] findAll(int kolvo) {
        Product[] products=new Product[kolvo];
         for (int i = 0; i < kolvo; i++) {

           Product product=new Product(i,"Product "+i,i*5+2*i+12);
            products[i]=product;
        }
        /*List<Product> productsList =new ArrayList<>();
        productsList.add(product);*/


        return products;

    }
    //товар по id
    public Product findOneById(int id) {
        Product product=new Product();
        product.setId(id);
        product.setTitle("Product "+ id);
        product.setCost(id*7+2*id+6);
        return product;
    }

}
