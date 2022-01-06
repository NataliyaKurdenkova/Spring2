package com.geekbrains.hibernate;
//Создайте сущность Product (Long id, String title, int price) и таблицу в базе данных для хранения объектов этой сущности;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private int price;
    //
    @ManyToOne

    @JoinColumn(name = "user_id")
    private User user_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getprice() {
        return price;
    }

    public void setId(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }



    @ManyToMany
    @JoinTable(
            name = "books_readers", // название таблицы
            joinColumns = @JoinColumn(name = "book_id"),  // то что связываем
            inverseJoinColumns = @JoinColumn(name = "reader_id") // то на что связываем
    )
    private List<Reader> readers;




    public List<Reader> getReaders() {
        return readers;
    }
    //
    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }


    @Override
    public String toString() {
        return "Product [" + id + " " + title + " " + user_id.getName() + "]";
    }
}
