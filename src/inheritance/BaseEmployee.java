package inheritance;

public class BaseEmployee extends ComissionEmployee{
	
	private double baseSalary;
	
	public BaseEmployee(String firstName, String lastName, String SSN, double grossSale, double commissionRate,double salary) {
		super(firstName, lastName, SSN, grossSale, commissionRate);
		// TODO Auto-generated constructor stub
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = ((baseSalary < 0.0) ? 0.0 : baseSalary);
	}
	
	
	public double earning()
	{
		return baseSalary + (commissionRate * grossSale);
	}
	
	@Override
	public String toString()
	{
		return String.format("Comission Employee: %s %s"
				+ "\nSSN: %s"
				+ "\nGross Sale: %.2f"
				+ "\nCommission Rate: %.2f"
				+ "\nTotal earning: %.2f", this.firstName, this.lastName, this.SSN,grossSale,commissionRate, earning());
	}
	

	
	
}
