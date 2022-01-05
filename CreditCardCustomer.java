package com.h2kinfosys.learn.day07;

public class CreditCardCustomer extends PreferredCustomer implements Reachable{

	private String address;
	private String ssn;
	
	public CreditCardCustomer(String gender, 
							int age, 
							String area, 
							String name, 
							String emailAddress,
							String address,
							String ssn) {
		super(gender, age, area, name, emailAddress);
		System.out.println("Loyalty Credit Card Issued for Customer ");
	}
	
	

	@Override
	protected float processDiscount() {
		System.out.println("4% discount for Credit Card customers ");
		return 4.0f;
	}
	@Override
	public void processPromotions() {
		super.processPromotions();
		System.out.println("Send Promotions to Address: " + this.getEmailAddress());
	}
	
	public int processLoyaltyPoints(float billingAmount) {
		int final_points = 0;
		if(billingAmount > 0) {
			float points = billingAmount / 4;
			final_points = (int) points;
		}
		return final_points;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



	@Override
	public boolean validateAddress(String address) {
		System.out.println("Address Validation: " + address + " with " + Reachable.validationMethod);
		return true;
	}

}
