package com.h2kinfosys.learn.day03;

public class Operators {

	public static void main(String[] args) {
		// Mathematics
		int first = 100;
		int second = 2;
		
		System.out.println("Addition: " + (first + second));
		System.out.println("Subtraction: " + (first - second));
		System.out.println("Division: " + (first / second));
		System.out.println("Multiplicaiton: " + (first * second));
		System.out.println("Modulus: " + (first % second));
		
		// increment / decrement ++
		// variables ++ --> use the value and then increase
		System.out.println("Value of variable " + (first++));
		System.out.println(first);
		// ++variable --> increase the value and then use it
		System.out.println("Value of variable " + (++second));
		
		// Comparison Operators: -- < <= >= > == !=
		// generates Boolean result
		System.out.println("Less than: " + (first < second));
		System.out.println("Less than or equals: " + (first <= second));
		System.out.println("Greater than or equals: " + (first >= second));
		System.out.println("Greater than: " + (first > second));
		System.out.println("Equals: " + (first == second));
		System.out.println("Not equal: " + (first != second));
		
		// Logical Operators - and, or , not
		boolean firstBool = true;
		boolean secondBool = true;
		
		System.out.println(firstBool && secondBool);
		System.out.println(firstBool || secondBool);
		System.out.println(!firstBool);
		
		
		
		
		
	}

}
