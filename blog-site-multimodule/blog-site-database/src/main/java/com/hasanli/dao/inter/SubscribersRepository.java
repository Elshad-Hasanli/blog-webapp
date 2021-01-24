package com.hasanli.dao.inter;

import com.hasanli.entity.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SubscribersRepository extends JpaRepository<Subscribers, Integer> {
    List<Subscribers> findBySubscriberMailContainingIgnoreCase(String subscriberMail);
}
