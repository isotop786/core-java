package inheritance;

public class NewEmployee extends CommissionEmployee2{
	
	private double baseSalary;

	public NewEmployee(String firstName, String lastName, String SSN, double grossSale, double commissionRate, double baseSalary) {
		super(firstName, lastName, SSN, grossSale, commissionRate);
		// TODO Auto-generated constructor stub
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	

	public double earnings()
	{
		return getBaseSalary() + super.earning();
	}
	
	@Override 
	public String toString()
	{
		return String.format("Employee: %s %s "
				+ "\nSSN: %s"
				+ "\nGross Sale: %.2f"
				+ "\nCommission Rate: %.2f"
				+ "\nBase Salary: %.2f"
				+ "\nTotal Earning: %.2f",
				getFirstName(),getLastName(), getSSN(),
				getCommissionRate(),getGrossSale(),getBaseSalary(),
				earnings()
				);
	}
	
	
	
	
	
}
