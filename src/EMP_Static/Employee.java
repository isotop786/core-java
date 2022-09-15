package EMP_Static;

public class Employee {
	private String firstName;
	private String lastName;
	private static int count =0;
	
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		count++;
		System.out.printf("Employee constructor: %s, %s; count = %d\n", this.firstName, this.lastName, this.count);
	}
	
	protected void finalize()
	{
		count--;
		System.out.printf("Employee finalizer: %s %s, count = %d\n", this.firstName, this.lastName,this.count);
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
	
	public static int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Employee is:"+this.firstName+" "+this.lastName+"\nCount ="+this.count;
	}
	
	
	
}
