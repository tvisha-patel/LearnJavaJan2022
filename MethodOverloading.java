package com.h2kinfosys.learn.day05;

public class MethodOverloading {

	private float normalTaxPercent = 0.1236f;
	private float foodTaxPercent = 0.02f;
	
	/*
	 * Method Overloading is a feature that allows a class 
	 * to have more than one method having the same name, 
	 * if their argument lists are different.
	 * 
	 * Method overloading rules
	 * 1. Method name should be exactly same 
	 * 2. Different parameters - change in type, change in number of parameters
	 */
	
	
	public float totalAmountWithTax(float totalAmount) {
		return (totalAmount + totalAmount * normalTaxPercent);
	}
	public float totalAmountWithTax(float totalAmount, boolean isFoodItem) {
		float finalAmount;
		if (isFoodItem) {
			finalAmount = totalAmount + totalAmount * foodTaxPercent;
		}else {
			finalAmount = totalAmount + totalAmount * normalTaxPercent;
		}
		return finalAmount;
	}
	public float totalAmountWithTax(float otherItemTotal, float foodItemTotal) {
		float taxAmountOther = otherItemTotal * normalTaxPercent;
		float taxAmountFood = foodItemTotal * foodTaxPercent;
		return ((otherItemTotal+taxAmountOther) + (foodItemTotal + taxAmountFood));
		
	}
}
