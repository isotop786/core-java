package inheritance;
//import inheritance.Emp.Employee;

public class BasePlusComissionEmployee2 extends BasePlusComissionEmployee{
	private double baseSalary;
	
	public BasePlusComissionEmployee2(String firstName, String lastName, String ssn, double grossSale,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, ssn, grossSale, commissionRate, baseSalary);
		// TODO Auto-generated constructor stub
		
		this.setBaseSalary(baseSalary);
	}


	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double earning()
	{
		return this.baseSalary + (getComissionRate() * getGrossSale());
	}
	
	@Override
	public String toString()
	{
		return String.format("Employee : %s %s \nSSN :%s\nGross Sale: %.2f\nRate: %.2f\n"
				+ "Base Salary: %.2f\nTotal Earning: %.2f", getFirstName(), getLastName(), getSsn(), getGrossSale(), getComissionRate(), this.baseSalary, this.earning());
	}
	
	
}
