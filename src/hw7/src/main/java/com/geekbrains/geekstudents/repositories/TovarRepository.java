package com.geekbrains.geekstudents.repositories;


import com.geekbrains.geekstudents.entities.Tovar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TovarRepository extends CrudRepository<Tovar, Long> {
//    Student findOneById(Long id);
//    Student findOneByTitleAndId(String title, Long id);

 /*  @Query(value ="select id, title, price from students where id = ?1", nativeQuery = true)
   Tovar myQuery(Long id);


    //List<Tovar> findAllByScoreBetween(int min, int max);


    List<Tovar> findAllByTitle(String title);
    List<Tovar> findAllByPrice(int price);

   Tovar findOneByTitleAndPrice(String title, int price);*/

}
