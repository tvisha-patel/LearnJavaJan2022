package com.h2kinfosys.learn.day02;

public class DataTypes {

	
	// Comment - Single Line
	
	/* 
	 * This is interesting		
	 * I can write multiple lines of comments
	 * */
	
	/** 
	 * This is not a comment 
	 * this is Java Doc
	 */
	
	// variable - has to start with alphabet
	int age = 5;
	int _a = 21;
	String customerReturntoVendor = "CRTV010";
	
	
	// Instance Variables
	
	String name = "Sample";
	float percentage = 99.97f;
	boolean isCustomer = false;
	
	// companyName - class variable - static
	static String companyName = "Best Buy Inc";
	
	public static void main(String[] args) {
		// ClassName instanceName = new className()
		// Instance variables are accessed with . operator on object
		DataTypes testDt1 = new DataTypes();
		DataTypes testDt2 = new DataTypes();
		
		System.out.println(testDt1.age); 
		System.out.println(testDt2.age); 
		
		testDt1.age = 21;
		System.out.println(testDt1.age);
		System.out.println(testDt2.age);
		
		// static variables are not object dependent
		testDt1.companyName = "Best Buy";
		System.out.println(DataTypes.companyName);
		
	}
}
