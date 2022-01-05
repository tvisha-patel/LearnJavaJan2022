package com.h2kinfosys.learn.day03;

public class Controls {

	public static void main(String[] args) {
		int first = 100;
		int second = 2;
		
		/*
		 * Condition - derives a boolean result
		 * if(Condition){
		 * 		block of code which executes when condition is true
		 * )else {
		 * 		(optional) block of code which executes when condition is flase
		 * }
		 */
		
		if(first > second) {
			System.out.println("True condition: Greater variable is " + first);
		}else if (first == second) {
				System.out.println("Equal Condition: Variables are equal");
			}else {
			System.out.println("False condition: Greater variable is " + second);
		}
		
	}
}

