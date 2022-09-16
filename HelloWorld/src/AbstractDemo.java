package com.cg.absrtact;

public class AbstractDemo {

	public static void main(String[] args) {
		Scooty Activa=new Scooty();
		Activa.numberOfWheels();

	}

}
  abstract class Vehicle // partially implemented class
  {
	  abstract void numberOfWheels();//no body
  }
  class Scooty extends Vehicle
  {
	  @Override
	  void numberOfWheels() {
		  System.out.println(2+"wheels");
	  }
  }