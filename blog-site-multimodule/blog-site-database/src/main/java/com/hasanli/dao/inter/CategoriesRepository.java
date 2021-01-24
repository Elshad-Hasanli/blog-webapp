package com.hasanli.dao.inter;

import com.hasanli.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
        List<Categories> findByNameContainingIgnoreCase(String name);
}
