package com.hasanli.dao.inter;

import com.hasanli.entity.ContactMessages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessagesRepository extends JpaRepository<ContactMessages, Integer> {
}
