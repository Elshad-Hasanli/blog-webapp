package com.hasanli.dao.inter;

import com.hasanli.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
        List<Categories> findByNameContainingIgnoreCase(String name);
}
