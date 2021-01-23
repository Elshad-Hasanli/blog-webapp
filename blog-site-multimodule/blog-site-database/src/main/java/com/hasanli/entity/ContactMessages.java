package com.hasanli.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact_messages", schema = "hasanli-blog", catalog = "")
public class ContactMessages {
    private Integer id;
    private String senderName;
    private String senderSurname;
    private String senderMail;
    private Byte messageReaded;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sender_name")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "sender_surname")
    public String getSenderSurname() {
        return senderSurname;
    }

    public void setSenderSurname(String senderSurname) {
        this.senderSurname = senderSurname;
    }

    @Basic
    @Column(name = "sender_mail")
    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    @Basic
    @Column(name = "message_readed")
    public Byte getMessageReaded() {
        return messageReaded;
    }

    public void setMessageReaded(Byte messageReaded) {
        this.messageReaded = messageReaded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactMessages that = (ContactMessages) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(senderName, that.senderName) &&
                Objects.equals(senderSurname, that.senderSurname) &&
                Objects.equals(senderMail, that.senderMail) &&
                Objects.equals(messageReaded, that.messageReaded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, senderName, senderSurname, senderMail, messageReaded);
    }
}
