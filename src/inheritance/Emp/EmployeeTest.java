package inheritance.Emp;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John", "Doe", "sdf3d23df", 23, 0.45);
		System.out.println(emp1);
		
		System.out.println("Earning is: "+emp1.earnings());

	}

}
