package com.sheryians.major.service;


import com.sheryians.major.model.Category;
import com.sheryians.major.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoriesRepository categoriesRepository;

    public List<Category> getAllCategory()
    {
        return categoriesRepository.findAll();
    }

    public void addCategory(Category category)
    {
        categoriesRepository.save(category);
    }

    public void removeCategoryById(int id)
    {
        categoriesRepository.deleteById(id);
    }
    public Optional<Category> getCategoryById(int id)
    {
        return categoriesRepository.findById(id);
    }

}
