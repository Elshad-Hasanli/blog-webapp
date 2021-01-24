package com.hasanli.dao.inter;

import com.hasanli.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContentsRepository extends JpaRepository<Contents, Integer> {
    List<Contents> findByContentHeaderContainingIgnoreCase(String header);
}
