package com.hasanli.service.impl;

import com.hasanli.entity.Subscribers;

import java.util.List;

public interface SubscribersServiceInter {
    public List<Subscribers> getAllSubscriber();
    public boolean addSubscriber(Subscribers subscriber);
    public int deleteSubscriber(Integer id);
    public Integer countOfSubscribers();
    public Subscribers findSubscriber(String name);
}
