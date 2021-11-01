package com.myorg.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myorg.subscription.model.Subscription;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscription, Integer> {

}
