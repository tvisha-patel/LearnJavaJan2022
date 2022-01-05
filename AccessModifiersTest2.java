package com.h2kinfosys.learn.day05;

public class AccessModifiersTest2 {

	public static void main(String[] args) {
		AccessModifiersTest test = new AccessModifiersTest();
		System.out.println(test.publicVariable);
		System.out.println(test.privateVariable);
		// Private variables are not visible
		// System.out.println(test.defaultVariable);
		
		System.out.println(test.protectedVariable);
	}

}
