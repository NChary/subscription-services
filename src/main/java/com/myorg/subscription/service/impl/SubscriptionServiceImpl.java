package com.myorg.subscription.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myorg.subscription.model.Subscription;
import com.myorg.subscription.repository.SubscribeRepository;
import com.myorg.subscription.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{
	
	@Autowired
	SubscribeRepository subscribeRepository;

	@Override
	public String saveSubscription(Subscription subscription) {
		subscribeRepository.save(subscription);
		return "From Service : "+subscription.getPartnerId();
	}

	@Override
	public List<Subscription> getSubscription() {
		return subscribeRepository.findAll();
	}

	@Override
	public String updateSubscription(Subscription subscription) {
		subscribeRepository.save(subscription);
		return "From Service : "+subscription.getPartnerId();
	}

	@Override
	public String deleteSubscription(Subscription subscription) {
		subscribeRepository.delete(subscription);
		return "Record deleted successfully";
	}
}
