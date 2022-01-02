package com.geekbrains.geekstudents.entities;
/*Задание, взять за основу проект с лекции
        1. Добавить сущность товар
        2. Добавить сущность категории
        3. Вывести список из 5 товаров с категориями на странице.*/

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Column(name = "namecategory")
    private String nameCategory;

    public List<Tovar> getTovars() {
        return tovars;
    }

    public void setTovars(List<Tovar> tovars) {
        this.tovars = tovars;
    }

    @OneToMany(mappedBy = "category")
    private List<Tovar> tovars;

     public Category() {    }

    public Category(String nameCategory) {
        this.nameCategory= nameCategory;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}