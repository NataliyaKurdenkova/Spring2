package com.geekbrains.geekstudents.services;


import com.geekbrains.geekstudents.entities.Tovar;
import com.geekbrains.geekstudents.repositories.TovarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TovarService {
    private TovarRepository tovarRepository;

    @Autowired
    public void setTovarRepository(TovarRepository tovarRepository) {
        this.tovarRepository = tovarRepository;
    }

    public List<Tovar> getAllProducts() {

//        List<Product> students = studentRepository.findAllByPriceBetween(20000.0, 40000.0);
//        Page<Student> pr = studentRepository.findAll(PageRequest.of(1,1));
//        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "Category"));

//        Student students = studentRepository.findOneById(3L);
//        List<Student> students = (List<Student>) studentRepository.findAllByScore(85);
        List<Tovar> tovars = (List<Tovar>) tovarRepository.findAll();
//        Student student = studentRepository.findOneByTitleAndPrice("Petr1", 2);
//        List<Student> students = new ArrayList<>();
//        students.add(student);

       /* Tovar tovar = tovarRepository.myQuery(1L);
        List<Tovar> tovars = new ArrayList<>();
        tovars.add(tovar);
*/
      //List<Tovar> tovars = tovarRepository.findAllByPriceBetween(3, 6);


        return tovars;
    }
    public void removeById(Long id) {
        tovarRepository.deleteById(id);
    }
}