package com.h2kinfosys.learn.day04;

public class WhileLoopTest {

	public static void main(String[] args) {
		// Total of 1 to 10
		
		/* 
		 * while (condition) {
		 * 		block of code till condition is true
		 * 		condition modifier
		 * }
		 */
		
		//vs 
		
		/* 
		 * do{
		 * 		block of code till condition is true
		 * 		condition modifier
		 * }while (condition);
		 */
		
		/*
		int counter = 1;
		int total = 0;
		
		do {
			total = total + counter;
			counter++;
		}while (counter <= 10);
		{
			
		}
		System.out.println("Total: " + total);
		*/
		
		int total1 = 0;
		for(int counter1 = 1; counter1 <= 10; counter1++) {
			total1 = total1 + counter1;
			System.out.println(counter1);
		}
		System.out.println("Total: " + total1);

	}

}
