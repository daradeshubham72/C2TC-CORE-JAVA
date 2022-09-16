package com.cg.Static;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("I am main method");
		dummy();
		
	}
    static // at the time of class loading ---class loader subsystem
    {
    	System.out.println("I am static 1");
    	dummy();
    }
    static
    {
    	System.out.println("I am static 2");
    }
    static
    {
    	System.out.println("I am static 3");
    }
    static void dummy()
    {
    	System.out.println("I am one dummy method");
    }
}
