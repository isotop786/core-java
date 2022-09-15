package oop;

public class Car{
	String make;
	String model;
	int year;
	
	public Car (String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void getCarInfo()
	{
		System.out.println("This is a "+make+" "+model+" of "+year);
	}
	
	public void drive() {
		System.out.println("You are driving a "+make);
	}
	
	public void sell()
	{
		System.out.println("You are selling your "+make+" "+model+" car");
	}
	
	
}
