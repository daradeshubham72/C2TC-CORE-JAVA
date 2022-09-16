package com.cg.Static;

public class OuterStatic {
	int x=100;          // int not static it will not take the value of x
	static int y=200;   //static int will take the value of y
	
       static class Inner
       {
    	   void display()
    	   {
    		   System.out.println(y); // try with (x)
    	   }
       }
       
	public static void main(String[] args) {
	Inner obj=new Inner();
	obj.display();
	

	}

}
