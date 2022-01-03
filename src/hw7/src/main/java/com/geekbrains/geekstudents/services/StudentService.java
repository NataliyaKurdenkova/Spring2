package com.geekbrains.geekstudents.services;

import com.geekbrains.geekstudents.entities.Student;
import com.geekbrains.geekstudents.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllProducts() {

//        List<Product> students = studentRepository.findAllByPriceBetween(20000.0, 40000.0);
//        Page<Student> pr = studentRepository.findAll(PageRequest.of(1,1));
//        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "Category"));

//        Student students = studentRepository.findOneById(3L);
//        List<Student> students = (List<Student>) studentRepository.findAllByScore(85);
        List<Student> students = (List<Student>) studentRepository.findAll();
//        Student student = studentRepository.findOneByNameAndScore("Petr1", 2);
//        List<Student> students = new ArrayList<>();
//        students.add(student);

       /* Student student = studentRepository.myQuery(1L);
        List<Student> students = new ArrayList<>();
        students.add(student);
*/
//       List<Student> students = studentRepository.findAllByScoreBetween(3, 6);
        return students;
    }
}