package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Shopcart.class)
                .buildSessionFactory();
        // CRUD
        Session session = null;
//        session = factory.getCurrentSession();
//////////////
//        session.beginTransaction();
//        Product  product= session.get(Product.class, 6);
////        session.getTransaction().commit();
//        System.out.println(product);

//
        session = factory.getCurrentSession();
        session.beginTransaction();
        ShopCart shopCart = session.get(Shopcart.class, 1);
        System.out.println(shopCart);
//        session.getTransaction().commit();
//        try {
//            // CREATE
//            session = factory.getCurrentSession();
//            product tmpProduct = new Product();
//            tmpProduct.setTitle("Pear");
//            session.beginTransaction();
//            session.save(tmpProduct);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            product tmpProduct = new Product();
//            User user = new User();
//            user.setName("Roman");
//            tmpProduct.setTitle("Bread");
//
//            tmpProduct.setUser_id(user);
//
//            session.beginTransaction();
//            session.save(user);
//            session.save(tmpProduct);
//            session.getTransaction().commit();

 //           CREATE User
//            session = factory.getCurrentSession();
//            User user = new User();
//            user.setName("Mariya");
//            session.beginTransaction();
//            session.save(user);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }
//        try {
//           // CREATE
//            session = factory.getCurrentSession();
//            product tmpProduct = new Product();
//            tmpProduct.setTitle("Sausage");
//            session.beginTransaction();
//            session.save(tmpProduct);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }

          // READ User
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            User user = session.get(User.class, 2);
////            session.getTransaction().commit();
//            System.out.println(user);

           // READ Product
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class, 5);
//            session.getTransaction().commit();
//            System.out.println(product);

//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            User user = session.get(User.class, 4);
//            System.out.println(user);
//            session.getTransaction().commit();


//             session = factory.getCurrentSession();
//              session.beginTransaction();
////            ShopCart shcart = session.get(ShopCart.class, 1);
//              List<ShopCart> shcarts = session.createQuery("from ShopCart").getResultList();
//              System.out.println(shcarts);
////            System.out.println(shcart);
//              session.getTransaction().commit();


//            UPDATE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class, 5);
//            product.setTitle("Vasya");
//            session.getTransaction().commit();
//            System.out.println(product);


    }
}
