package com.h2kinfosys.learn.day06;

public class ParentClass {

	private String privateString = "Parent Private String";
	String defaultString = "Parent Default String";
	protected String protectedString = "Parent Protected String";
	public String publicString = "Parent Public String";
	
	
	public void testParentPublic() {
		System.out.println("This is Public Method from Parent");
	}
	
	protected void testParentProtected() {
		System.out.println("This is Protected Method from Parent");
	}
	
	void testParentDefault() {
		System.out.println("This is Default Method from Parent");
	}
}
