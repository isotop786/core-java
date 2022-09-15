package Composition;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String first, String last, Date birthDate, Date hireDate)
	{
		this.firstName = first;
		this.lastName = last;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}
	
	public String toString()
	{
		return String.format("%s, %s Hired: %s, his date of birth is: %s",
				this.firstName, this.lastName, this.hireDate, this.birthDate
				);
	}
	
}
