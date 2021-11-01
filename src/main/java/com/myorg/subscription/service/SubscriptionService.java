package com.myorg.subscription.service;

import java.util.List;

import com.myorg.subscription.model.Subscription;

public interface SubscriptionService {

	String saveSubscription(Subscription subscription);
	
	List<Subscription> getSubscription();
	
	String updateSubscription(Subscription subscription);
	
	String deleteSubscription(Subscription subscription);
}
