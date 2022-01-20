package gb.artem.demo_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductsController {
    private ProductsService productsService;
    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @RequestMapping("/products")
    public String getAll(Model model) {
        List<Product> productList = ProductsService.getAll();
        model.addAttribute("products",productList);

        return "products";
    }

    @RequestMapping("/test")
    public String helloWorld() {
        return "Hello World";
    }


    /*	@RequestMapping(path = "/showAllProducts", method = RequestMethod.GET)
    public String showallproduct(Model uiModel, @RequestParam int kolvo) {
        //int kolvo=6;
        Product[] products = new Product[kolvo];
        products = productsService.getfindAll(kolvo);

        Products productsList = new Products();
        productsList.setProducts(products);
        uiModel.addAttribute("products", productsList); //products - это view

        return "products";
    }*/
  /*  @RequestMapping("/showAllProducts")
    //public String showallproduct(@RequestParam(kolvo = "kolvo", required = false, defaultValue = "1") String kolvo, Model uiModel) {
    public String showallproduct(Model uiModel) {
         int kolvo1 = 1;
       // int kolvo1=parseInt(kolvo);
        Product[] products = new Product[kolvo1];
        products = productsService.getfindAll(kolvo1);

        Products productsList = new Products();
        productsList.setProducts(products);
        uiModel.addAttribute("products", products);
       // uiModel.addAttribute("products", productsList); //products - это view
        System.out.println(Arrays.toString(products));
        //return "products";
        return  Arrays.toString(products);
    }
*/
    @RequestMapping(value="/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        Product product = productsService.getfindByID(id);
        return product;
    }

    @RequestMapping("/showFormProduct")
    public String showFormProduct(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }

    //нажатие на кнопку формы
    @RequestMapping("/insert")
    public String processForm(@ModelAttribute("product") Product product) {
        return "product-form-result";
    }
}
