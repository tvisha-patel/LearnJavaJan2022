package com.h2kinfosys.learn.day10;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// ordered (indexed) - allow dupes - random access (element, sublist)
		// ArrayList , LinkedList
		ArrayList<String> items = new ArrayList<String>();
		//adding element
		items.add("apples");
		items.add("oranges");
		items.add("jackfruit");
		items.add("grapes");
		
		System.out.println(items);
		
		System.out.println(items.get(0));
		System.out.println(items.get(1));
		
		//remove
		//items.remove(0);
		items.remove("apples");
		System.out.println(items);
		
		if(items.contains("oranges")) {
			System.out.println("oranges are present");
		}
		
		for (String eachItem : items) {
			System.out.println(eachItem);
		}
		
		// Random Access
		List<String> sublist = items.subList(0, 2);
		System.out.println(sublist);
	}

}
