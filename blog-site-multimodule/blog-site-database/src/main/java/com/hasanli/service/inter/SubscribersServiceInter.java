package com.hasanli.service.inter;

import com.hasanli.entity.Subscribers;

import java.util.List;

public interface SubscribersServiceInter {
    public List<Subscribers> getAllSubscriber();
    public boolean addSubscriber(Subscribers subscriber);
    public int deleteSubscriber(Integer id);
    public Integer countOfSubscribers();
    public  List<Subscribers> findSubscriber(String subscriberMail);
}
