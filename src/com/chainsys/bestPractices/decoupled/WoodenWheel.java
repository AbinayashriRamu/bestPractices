package com.chainsys.bestPractices.decoupled;

public class WoodenWheel implements IWheel
{
	public String location;
	public void rotate()
	 {
		 System.out.println("Wooden Wheel rotating");
	 }
	 public void stopRotation()
	 {
		 System.out.println("Wooden Wheel stopped");
	 }
}