package Composition;

public class Tester {
	public static void main(String[] args)
	{
		Date dob  = new Date(1,2,1993);
		Date doh  = new Date(11,2,2021);
		
		Employee e1 = new Employee("John", "Deo",dob,doh);
		System.out.println(e1);
	}
}
