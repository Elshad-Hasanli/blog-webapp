package com.hasanli.service.inter;

import com.hasanli.entity.Categories;

import java.util.List;

public interface CategoriesServiceInter {
    public List<Categories> getAllCategory();
    public boolean updateCategory(Categories category);
    public boolean addCategory(Categories category);
    public int deleteCategory(Integer id);
    public List<Categories> findCategory(String name);
}
