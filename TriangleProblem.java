package com.h2kinfosys.learn.day03;

public class TriangleProblem {

	public static void main(String[] args) {
		int side1 = 10;
		int side2 = 10;
		int side3 = 10;
		
		/*
		 * (side2 + side3) > side1
		 * (side1 + side3) > side2
		 * (side2 + side1) > side3
		 */
		
		// Two sides greater than the third - can triangle be formed?
		if ((side2 + side3) > side1 && (side1 + side3) > side2 && (side2 + side1) > side3) {
			System.out.println("A triangle can be formed.");
		}else {
			System.out.println("A triangle cannot be formed.");
				
			}
		}
		

	}

