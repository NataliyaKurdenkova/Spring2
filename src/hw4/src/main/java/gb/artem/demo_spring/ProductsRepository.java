package gb.artem.demo_spring;
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
   /* public Product[] findAll(int kolvo) {
        Product[] products=new Product[kolvo];
         for (int i = 0; i < kolvo; i++) {

           Product product=new Product(i,"Product "+i,i*5+2*i+12);
            products[i]=product;
        }

        return products;

    }*/
    public static List<Product> findAll() {
        int kolvo=5;
       // Product[] products=new Product[kolvo];
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < kolvo; i++) {

            Product product=new Product(i,"Product "+i,i*5+2*i+12);

            list.add(product);
        }

        return list;

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
