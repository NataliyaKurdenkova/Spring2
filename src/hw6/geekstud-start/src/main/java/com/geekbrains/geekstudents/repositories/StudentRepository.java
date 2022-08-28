package com.geekbrains.geekstudents.repositories;

import com.geekbrains.geekstudents.entities.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StudentRepository extends CrudRepository<Student, Long> {
//    Student findOneById(Long id);
//    Student findOneByTitleAndId(String title, Long id);
   /* @Query(value ="select id, name, score from students where id = ?1", nativeQuery = true)
    Student myQuery(Long id);

*/
    List<Student> findAllByScoreBetween(int min, int max);
//    List<Student> findAllByName(String name);
//    List<Student> findAllByScore(int score);

    Student findOneByNameAndScore(String name, int score);

}
