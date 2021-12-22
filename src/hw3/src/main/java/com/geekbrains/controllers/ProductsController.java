package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.entites.Products;

import com.geekbrains.entites.Student;
import com.geekbrains.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

 /*     @RequestMapping("/showProducts")
      public String showproduct(Model uiModel) {
          Product[] products = new Product[5];
          for (int i = 0; i < products.length; i++) {
              products[i] = productsService.getProduct(i);
          }

         Products productsList = new Products();
          productsList.setProducts(products);
          uiModel.addAttribute("products", productsList); //products - это view
          return "products";//products - это view
      }
*/
    @RequestMapping(path ="/showAllProducts", method = RequestMethod.GET)
        public String showallproduct(Model uiModel, @RequestParam int kolvo) {
        //int kolvo=6;
        Product[] products = new Product[kolvo];
        products = productsService.getfindAll(kolvo);

        Products productsList = new Products();
        productsList.setProducts(products);
        uiModel.addAttribute("products", productsList); //products - это view

        return "products";
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
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
