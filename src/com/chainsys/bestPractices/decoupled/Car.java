package com.chainsys.bestPractices.decoupled;
// Objects of this class can work with any engine, and with any wheel
// The car class is decoupled from PetrolEngine class, and SteelWheel class
public class Car {
	private IEngine engine; //early bound with engine interface
	private IWheel[] wheels; //early bound with wheel interface
	// The type of engine, and the type of wheel will be injected to the car class 
	// At runtime using the constructors. This is called as constructor based 
	// dependency injection
	public Car(IEngine engine,IWheel[] wheel)
	{
		this.engine=engine; 
		this.wheels=wheel;
		
	}
   public void startCar() {
	   engine.start();
	   wheels[0].rotate();
	   wheels[1].rotate();
	   wheels[2].rotate();
	   wheels[3].rotate();
   }
   public IWheel[] getWheels() {
	   return this.wheels;
   }
}