package com.geekbrains.geekmarketwinter.controllers;

import com.geekbrains.geekmarketwinter.entites.Category;
import com.geekbrains.geekmarketwinter.entites.Product;
import com.geekbrains.geekmarketwinter.entites.ProductImage;
import com.geekbrains.geekmarketwinter.services.CategoryService;
import com.geekbrains.geekmarketwinter.services.ImageSaverService;
import com.geekbrains.geekmarketwinter.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable(name = "id") Long id) {
        Category category = categoryService.getCategoryById(id);
        if (category == null) {
            category = new Category();
            category.setId(0L);
        }
        model.addAttribute("category", category);
       // model.addAttribute("categories", categoryService.getAllCategories());
        return "/edit-category";
    }

    @PostMapping("/edit")
    public String processCategoryAddForm(@Valid @ModelAttribute("category") Category category, BindingResult theBindingResult, Model model) {
        if (category.getId() == 0 && categoryService.isCategoryWithTitleExists(category.getTitle())) {
            theBindingResult.addError(new ObjectError("category.title", "категория с таким названием уже существует")); // todo не отображает сообщение
        }

       /* if (theBindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.getAllCategories());
            return "edit-category";
        }
        if (theBindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.getAllCategories());
            return "edit-product";
        }*/
        /*if (!file.isEmpty()) {
            String pathToSavedImage = imageSaverService.saveFile(file);
            ProductImage productImage = new ProductImage();
            productImage.setPath(pathToSavedImage);
            productImage.setProduct(product);
            product.addImage(productImage);
        }*/

       categoryService.saveCategory(category);
        return "redirect:/shop";
    }
}
