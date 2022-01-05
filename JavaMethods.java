package com.h2kinfosys.learn.day05;

public class JavaMethods {
	
	private float normalTaxPercent = 0.1236f;
	private float foodTaxPercent = 0.02f;

	public static void main(String[] args) {
		JavaMethods test = new JavaMethods();
		float totalAmount = test.totalAmountWithTax(100.0f, 20.5f);
		System.out.println("Total Billing Amount " + totalAmount);
	}
	
	/*
	 * 1. Access modifier - public/ private - instance/ static
	 * 2. Return type - output of method (expected)
	 * 3. Name of method - same rules as variable names - logical
	 * 4. Parameters/ input to methods - one - many
	 * 5. Method body {}
	 * 6. Exception - learning this later
	 */
	
	
	public float totalAmountWithTax(float totalAmount) {
		float tax = 0.1236f;
		float taxAmount = totalAmount*tax;
		float finalAmount = totalAmount + taxAmount;
		return finalAmount;
	}
	public float totalAmountWithTax(float otherItemTotal, float foodItemTotal) {
		float taxAmountOther = otherItemTotal * normalTaxPercent;
		float taxAmountFood = foodItemTotal * foodTaxPercent;
		return ((otherItemTotal+taxAmountOther) + (foodItemTotal + taxAmountFood));
		
	}
	
}
