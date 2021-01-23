package com.hasanli.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Subscribers {
    private Integer id;
    private String subscriberMail;
    private String subscriberName;
    private String subscriberSurname;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subscriber_mail")
    public String getSubscriberMail() {
        return subscriberMail;
    }

    public void setSubscriberMail(String subscriberMail) {
        this.subscriberMail = subscriberMail;
    }

    @Basic
    @Column(name = "subscriber_name")
    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Basic
    @Column(name = "subscriber_surname")
    public String getSubscriberSurname() {
        return subscriberSurname;
    }

    public void setSubscriberSurname(String subscriberSurname) {
        this.subscriberSurname = subscriberSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscribers that = (Subscribers) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(subscriberMail, that.subscriberMail) &&
                Objects.equals(subscriberName, that.subscriberName) &&
                Objects.equals(subscriberSurname, that.subscriberSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subscriberMail, subscriberName, subscriberSurname);
    }
}
