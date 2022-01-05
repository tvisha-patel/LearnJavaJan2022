package com.h2kinfosys.learn.day07;

public class PreferredCustomer extends Customer{

	private String name;
	private String emailAddress;
	
	public PreferredCustomer(String gender, 
							int age, 
							String area,
							String name,
							String emailAddress) {
		super(gender, age, area);
	
		this.setEmailAddress(emailAddress);
		this.setName(name);
		System.out.println("Preferred Customer is created");
	}
	
	/*
	 * @ something - annotation -
	 * additional functionality or info for statement below
	 * 1. Name: Exact same method name
	 * 2. Return type: should be same or co-variant 
	 * (class or subclass - 
	 * ex - customer and preferred customer)
	 * 3. Access Modifier: Overriding method cannot be more 
	 * restrictive than original
	 * Parameters: Exact Match
	 * 5. Exception: co-variant (later)
	 */
	
	@Override
	protected float processDiscount() {
		System.out.println("2.5% discount for Preferred customers ");
		return 2.5f;
	}
	
	public void processPromotions() {
		System.out.println("Send Promotions to email : " + this.getEmailAddress());
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
}
