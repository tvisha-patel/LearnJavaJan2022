package com.h2kinfosys.learn.day05;

public class ConstructorsTest {
	
	/*
	 * 1. Access Modifier - public / private - instance / static
	 * 2. Name of method - exactly same as ClassName
	 * 3. Parameters / Input to Methods - one - many
	 * 5. Method Body {}
	 * 6. Exception - learn this later
	 */

	public ConstructorsTest() {
		System.out.println("This is my first constructor");
	}
	
	public ConstructorsTest(String test) { //overloading
		System.out.println("This is my first Constructor :: " + test);
	}
	
	public ConstructorsTest(int test) { //overloading
		System.out.println("This is my first Constructor :: " + test);
	}
	
	public ConstructorsTest(int test, String secondTest) { //overloading
		System.out.println("This is my first Constructor :: " + test);
	}
	public static void main(String[] args) {
		// ClassName instanceName = new Classname()
		ConstructorsTest test = new ConstructorsTest(100, "Something"); // Constructor
		

	}

}
