package com.hasanli.service.impl;


import com.hasanli.dao.inter.CategoriesRepository;
import com.hasanli.entity.Categories;
import com.hasanli.service.inter.CategoriesServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriesServiceImpl implements CategoriesServiceInter {
    @Autowired
    CategoriesRepository categoriesRepository;
    @Override
    public List<Categories> getAllCategory() {
      return categoriesRepository.findAll();
    }

    @Override
    public boolean updateCategory(Categories category) {
        Categories updatedCategory=categoriesRepository.save(category);
        if(updatedCategory!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean addCategory(Categories category) {
        List<Categories> categories=categoriesRepository.findAll();
        for(Categories findedCategory:categories){
            if(findedCategory.getName().equals(category.getName())){
                return false;
            }

        }
        Categories savedCategory=categoriesRepository.save(category);
        if(savedCategory==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteCategory(Integer id) {
        categoriesRepository.deleteById(id);

        if( categoriesRepository.findById(id)==null){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public List<Categories>findCategory(String name) {
        List<Categories> categories=categoriesRepository.findByNameContainingIgnoreCase(name);
        return categories;
    }
}
