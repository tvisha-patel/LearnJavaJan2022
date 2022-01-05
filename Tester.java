package com.h2kinfosys.learn.day06;

public class Tester {

	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		System.out.println(parent.protectedString);
		parent.testParentDefault();
		
		ChildClass child = new ChildClass();
		System.out.println(child.protectedString);
		child.testParentProtected();
		

	}

}
