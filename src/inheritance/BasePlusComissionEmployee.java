package inheritance;

public class BasePlusComissionEmployee {
	private String firstName;
	private String lastName;
	private String ssn;
	private double grossSale;
	private double comissionRate;
	private double baseSalary;
	
	public BasePlusComissionEmployee(String firstName, String lastName, String ssn, double grossSale, double commissionRate, double baseSalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn  = ssn;
		setGrossSale(grossSale);
		setComissionRate(commissionRate);
		setBaseSalary(baseSalary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = ((grossSale < 0.0) ? 0.0 : grossSale);
	}

	public double getComissionRate() {
		return comissionRate;
	}

	public void setComissionRate(double comissionRate) {
		this.comissionRate = ((comissionRate >0.0 && comissionRate < 1.0) ? comissionRate : 0.0 );
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = ((baseSalary < 0.0) ? 0.0 : baseSalary);
	}
	
	public double earning()
	{
		return this.baseSalary + (this.comissionRate * this.grossSale);
	}
	
	@Override
	public String toString()
	{
		return String.format("Employee : %s %s \nSSN :%s\nGross Sale: %.2f\nRate: %.2f\n"
				+ "Base Salary: %.2f\nTotal Earning: %.2f", this.firstName, this.lastName, this.ssn, this.grossSale, this.comissionRate, this.baseSalary, this.earning());
	}
	
	

}
