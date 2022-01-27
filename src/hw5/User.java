package com.geekbrains.hibernate;
//Создать сущность User (набор полей определить самому)
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @OneToMany(mappedBy = "user_id", fetch = FetchType.LAZY)
    private List<Product> products;


    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }



    @Override
    public String toString() {
        String allProducts = "";
        for (Product pr : products) {
            allProducts+= pr.getTitle() + " ";
        }
        return "User [" + id + " " + name + " " + allProducts + "]";

    }


}