package com.hasanli.service.impl;

import com.hasanli.dao.inter.ContactMessagesRepository;
import com.hasanli.entity.Categories;
import com.hasanli.entity.ContactMessages;
import com.hasanli.service.inter.ContactMessagesServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactMessagesServiceImpl implements ContactMessagesServiceInter {
    @Autowired
    ContactMessagesRepository contactMessagesRepository;
    @Override
    public List<ContactMessages> getAllMessages() {
      List<ContactMessages> contactMessages= contactMessagesRepository.findAll();
      return contactMessages;
    }

    @Override
    public List<ContactMessages> getAllUnreadedMessages() {
        List<ContactMessages> unreadedContactMessages= contactMessagesRepository.findContactMessagesByMessageReaded((byte)0);
        return unreadedContactMessages;
    }

    @Override
    public boolean addMessage(ContactMessages message) {
        ContactMessages savedMessages=contactMessagesRepository.save(message);
        if(savedMessages==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteMessage(Integer id) {
        contactMessagesRepository.deleteById(id);

        if( contactMessagesRepository.findById(id)==null){
            return 1;
        }else {
            return 0;
        }
    }
}
