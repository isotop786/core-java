package Polymorphism;


public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String first, String last, String SSN, double weeklySalary)
	{
		super(first,last,SSN);
		
		if(weeklySalary < 0.0)
		{
			throw new IllegalArgumentException("Weekly salary must be greater than 0.0");
		}
		
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public double earnings()
	{
		return this.getWeeklySalary();
	}
	
	public String toString()
	{
		return String.format("Salaried employee: %s %s: "
				+ "\nSSN: %s"
				,getFirstName(),getLastName(),getSSN());
	}
	
}
