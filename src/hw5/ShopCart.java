package com.geekbrains.hibernate;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shopcarts")
public class Shopcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdZakaza() {
        return idZakaza;
    }

    public void setIdZakaza(String idZakaza) {
        this.idZakaza = idZakaza;
    }

    @Column(name = "id-zakaza")
    private String idZakaza;
    private List<Product> products;


    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    @ManyToMany
    @JoinTable(
            name = "products_id-zakaza",
            joinColumns = @JoinColumn(name = "shopcart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )


    public Shopcart() {
    }

    @Override
    public String toString() {
        String allProducts = "";
        for (Product pr : products) {
            allProducts += pr.getTitle() + " ";
        }
        return "Shopcart [" + id + " " + idZakaza + " " + allProducts + "]";
    }
}