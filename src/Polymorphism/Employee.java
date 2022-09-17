package Polymorphism;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String SSN;
	
	public Employee(String first, String last, String ssn)
	{
		this.firstName = first;
		this.lastName = last;
		this.SSN = ssn;
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

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public String toString()
	{
		return String.format("%s %s\nSSN: %s",getFirstName(),getLastName(),getSSN() );
	}
	
	public abstract double earnings();
	
	public double getPaymentAmount()
	{
		return earnings();
	}
	
}
