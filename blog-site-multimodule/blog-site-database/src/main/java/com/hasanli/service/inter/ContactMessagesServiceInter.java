package com.hasanli.service.inter;

import com.hasanli.entity.ContactMessages;

import java.util.List;

public interface ContactMessagesServiceInter {
    public List<ContactMessages> getAllMessages();
    public List<ContactMessages> getAllUnreadedMessages();
    public boolean addMessage(ContactMessages message);
    public int deleteMessage(Integer id);
}
