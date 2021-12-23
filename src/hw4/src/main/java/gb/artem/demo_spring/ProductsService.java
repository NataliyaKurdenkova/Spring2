package gb.artem.demo_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;
    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

  public Product[] getfindAll(int kolvo) {

        return productsRepository.findAll(kolvo);
    }
    public Product getProduct(int id) {

        return productsRepository.newProduct(id);
    }

    public Product getfindByID(int id) {
        return productsRepository.findOneById(id);
    }

    public ProductsService() {

    }

   /* public Product[] getfindAll2(int kolvo) {

        return productsRepository.findAll(kolvo);
    }*/
}
