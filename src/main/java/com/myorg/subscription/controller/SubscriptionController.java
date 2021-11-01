package com.myorg.subscription.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.subscription.model.Subscription;
import com.myorg.subscription.service.SubscriptionService;

@RestController //It makes class as Controller Class
public class SubscriptionController {

	//To Autowire - interface 
	@Autowired // Create an object for us 
	SubscriptionService subScriptionObj;
	
	@PostMapping("/subscription")
	public String saveSubscription(@Valid @RequestBody Subscription subscription) {
		return subScriptionObj.saveSubscription(subscription);
	}

	@GetMapping("/subscription")
	public List<Subscription> getAllSubscriptions(){
		return subScriptionObj.getSubscription();
	}
	
	@PutMapping("/subscription")
	public String updateSubscription(@RequestBody Subscription subscription) {
		return subScriptionObj.saveSubscription(subscription);
	}
	
	@DeleteMapping("/subscription")
	public String deleteSubscription(@RequestBody Subscription subscription) {
		System.out.println("Hello, github");
		return subScriptionObj.deleteSubscription(subscription);
	
	}
	
}
