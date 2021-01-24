package com.hasanli.dao.inter;

import com.hasanli.entity.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminsRespository extends JpaRepository<Admins, Integer> {
    List<Admins> findByNameContainingIgnoreCase(String name);
}
