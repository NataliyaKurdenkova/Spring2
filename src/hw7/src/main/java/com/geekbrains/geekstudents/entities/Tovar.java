package com.geekbrains.geekstudents.entities;
/*Задание, взять за основу проект с лекции
        1. Добавить сущность товар
        2. Добавить сущность категории
        3. Вывести список из 5 товаров с категориями на странице.*/

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "tovars")
public class Tovar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    /* @Column(name = "category")
            private int category;
        */
    @ManyToOne
    @JoinColumn(name="category")
    private Category category;



    public Tovar() {
    }

    public Tovar(String title, int price) {
        this.title = title;
        this.price = price;
        //this.category = category;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   /* public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }*/
}