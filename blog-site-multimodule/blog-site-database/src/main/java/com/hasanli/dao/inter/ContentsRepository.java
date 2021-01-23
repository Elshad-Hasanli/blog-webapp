package com.hasanli.dao.inter;

import com.hasanli.entity.Contents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentsRepository extends JpaRepository<Contents, Integer> {
}
