package com.chainsys.bestPractices.decoupled;

public class DieselEngine implements IEngine {
	  public void start(){
   	   System.out.println("Diesel engine started");
      }
      public void stop()
      {
   	   System.out.println("Diesel engine stopped");
      }

}