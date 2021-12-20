package com.geekbrains.entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class ProductRepository {
    private final Map<Long,Product> productMap=new ConcurrentHashMap<>();
    private final AtomicLong identity=new AtomicLong(0);

    public List<Product> findAll(){
        return new ArrayList<>(productMap.values());
    }
    /*
    public void update(Product product){
        productMap.put(product.getId(),product);
    }*/
// поиск продукта по ID
    public Product findByID(long id){
        return productMap.get(id);
    }
    /* если id указан, то мы просто обновляем, если нет, то генерируем id  и добавляем*/

    public void save(Product product){
        if(product.getId()==null) {
            long id = identity.incrementAndGet();
            product.setId(id);
        }

        productMap.put(product.getId(), product);

    }

    /* public void insert(Product product){
         long id=identity.incrementAndGet();
         product.setId(id);
         productMap.put(id,product);
     }*/
    public void delete(long id){
        productMap.remove(id);
    }

}
