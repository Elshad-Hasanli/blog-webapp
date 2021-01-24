package com.hasanli.service.impl;

import com.hasanli.dao.inter.SubscribersRepository;
import com.hasanli.entity.Subscribers;
import com.hasanli.service.inter.SubscribersServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribersServiceImpl implements SubscribersServiceInter {
    @Autowired
    SubscribersRepository subscribersRepository;
    @Override
    public List<Subscribers> getAllSubscriber() {
        List<Subscribers> allAdmins=subscribersRepository.findAll();
        return allAdmins;
    }

    @Override
    public boolean addSubscriber(Subscribers subscriber) {
        List<Subscribers> subscribers=subscribersRepository.findAll();
        for(Subscribers findedSubscribers:subscribers){
            if(findedSubscribers.getSubscriberMail().equals(subscriber.getSubscriberMail())){
                return false;
            }

        }
        Subscribers savedSubscriber=subscribersRepository.save(subscriber);
        if(savedSubscriber==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteSubscriber(Integer id) {
        subscribersRepository.deleteById(id);

        if( subscribersRepository.findById(id)==null){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public Integer countOfSubscribers() {
        Integer countOfSubscribers=(int)subscribersRepository.count();
        return countOfSubscribers;
    }

    @Override
    public  List<Subscribers> findSubscriber(String subscriberMail) {
        List<Subscribers> findedSubscribers=subscribersRepository.findBySubscriberMailContainingIgnoreCase(subscriberMail);
        return findedSubscribers;
    }
}
