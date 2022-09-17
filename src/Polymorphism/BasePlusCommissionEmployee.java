package Polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String first, String last, String ssn, double grossSale, double commissionRate, double baseSalary) {
		super(first, last, ssn, grossSale, commissionRate);
		// TODO Auto-generated constructor stub
		if(baseSalary < 0.0)
		{
			throw new IllegalArgumentException("Base salary can not be less than 0");
		}
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary < 0.0)
		{
			throw new IllegalArgumentException("Base Salary can not be less than 0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings()
	{
		return this.getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString()
	{
		return String.format("BasePlusCommission Employee: %s"
				
				+ "\nBase salary: $%.2f"
				, super.toString(),getBaseSalary());
	}
	
	

}
