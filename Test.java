package com.recursion.easy;

public class Test {
	
	public static void method()
	{
		System.out.println("hello...");
		method();
	}
    public static void main(String[] args) {
		
    	method();  //hello 
    	
    	// java.lang.StackoverflowError occurs
	}
}
