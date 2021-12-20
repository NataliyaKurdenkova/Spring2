package com.geekbrains.entites;
/*
Задание
1. Разобраться с примером проекта на Spring MVC;
2. Создать класс Товар (Product), с полями id, title, cost;
3. Товары необходимо хранить в репозитории (класс, в котором в виде List<Product> хранятся товары). Репозиторий должен уметь выдавать список всех товаров и товар по id;
4. Сделать форму для добавления товара в репозиторий и логику работы этой формы;
5. Сделать страницу, на которой отображаются все товары из репозитория.
 */
public class Product {
    private Long id;
    private String name;
    private int cost;
    public Product(){

    }
    public Product(Long id, String name, int cost){
        this.id=id;
        this.name=name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}