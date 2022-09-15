package members;

public class Member {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	
	public Member(String firstName, String lastName, int age, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	
	public void contact()
	{
		System.out.printf("%s 's email is %s",this.firstName, this.email);
	}
	
	
	@Override
	public String toString()
	{
		return String.format("Hi I am %s %s and I am %d years old.",this.firstName,this.lastName, this.age);
	}
	

}
