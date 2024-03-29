package com.geekbrains.geekmarketwinter.services;

import com.geekbrains.geekmarketwinter.entites.Category;
import com.geekbrains.geekmarketwinter.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
    public List<Category> getAllCategories() {
        return (List<Category>)categoryRepository.findAll();
    }
    public boolean isCategoryWithTitleExists(String categoryTitle) {
        return categoryRepository.findOneByTitle(categoryTitle) != null;
    }
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}
