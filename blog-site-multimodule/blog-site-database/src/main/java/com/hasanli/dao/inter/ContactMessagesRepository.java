package com.hasanli.dao.inter;

import com.hasanli.entity.ContactMessages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactMessagesRepository extends JpaRepository<ContactMessages, Integer> {
   List<ContactMessages> findContactMessagesByMessageReaded(byte result);

}
