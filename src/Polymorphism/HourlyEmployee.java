package Polymorphism;

public class HourlyEmployee extends Employee{
	
	private double hours;
	private double hourlyWage;

	public HourlyEmployee(String first, String last, String ssn, double hours, double hourlyWage) {
		super(first, last, ssn);
		// TODO Auto-generated constructor stub
		if(hours < 0.0)
		{
			throw new IllegalArgumentException("Hour must be greater than 0");
		}
		
		if(hourlyWage < 0.0)
		{
			throw new IllegalArgumentException("Hourly wage must be greater than 0");
		}
		
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if(hours < 0.0)
		{
			throw new IllegalArgumentException("Hours must be greater than 0");
		}
		else {
			this.hours = hours;
		}
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage < 0.0)
		{
			throw new IllegalArgumentException("Hourly wage must be greater than 0");
		}
		else {
			this.hourlyWage = hourlyWage;
		}
	}
	
	public double earnings()
	{
		if(hours <= 40)
		{
			return this.getHours() * this.getHourlyWage();
		}
		
		return 40 * this.getHourlyWage() + (this.getHours() -40) * this.getHourlyWage() *1.5;
	}
	
	@Override
	public String toString()
	{
		return String.format("Hourly employee: %s"
				+ "\nHourly wage:$%.2f"
				+ "\nTotal hours worked:%.2f"
				, super.toString(),this.getHourlyWage(),this.getHours());
	}
	
	
	
}
