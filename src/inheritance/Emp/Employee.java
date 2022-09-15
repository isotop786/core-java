package inheritance.Emp;

public class Employee extends Object{
	
	private String firstName;
	private String lastName;
	private String ssn;
	private double sales;
	private double rate;
	
	public Employee(String firstName, String lastName, String ssn, double sales, double rate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		setSales(sales);
		setRate(rate);
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

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = ((sales < 0.0 ) ? 0.0 : sales);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
	}
	
	public double earnings()
	{
		return this.rate * this.sales;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", sales=" + sales
				+ ", rate=" + rate + "]";
	}
	

	
	
	
}
