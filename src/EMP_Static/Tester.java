package EMP_Static;

public class Tester {
	public static void main(String[] args) {
		System.out.println("Employee count: "+Employee.getCount());
		
		Employee e1 = new Employee("John", "Deo");
		Employee e2 = new Employee("Carla", "Deo");
		System.out.println(e1);
		
		System.gc();
		
		System.out.println("Employee count: "+Employee.getCount());
	}
}
