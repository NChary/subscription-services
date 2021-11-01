package com.myorg.subscription.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="subscription")
public class Subscription {

	@Id
	@Column(name="subscription_id")
	private int subscriptionId;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="partner_id")
	private String partnerId;
	
	@Column(name="user_count")
	private int userCount; // 3 users
	
	@Column(name="module1")
	private boolean module1;
	
	@Column(name="module2")
	private boolean module2;
	
	@Column(name="module3")
	private boolean module3;
	
	@Column(name="volume")
	private int volume;
	
	public int getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	public boolean isModule1() {
		return module1;
	}
	public void setModule1(boolean module1) {
		this.module1 = module1;
	}
	public boolean isModule2() {
		return module2;
	}
	public void setModule2(boolean module2) {
		this.module2 = module2;
	}
	public boolean isModule3() {
		return module3;
	}
	public void setModule3(boolean module3) {
		this.module3 = module3;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
