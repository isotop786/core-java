package Polymorphism;

public class PayroolSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalariedEmployee sE = new SalariedEmployee("Jhon", "Smith", "112-3544-545", 800.00);
		HourlyEmployee hE = new HourlyEmployee("Karen", "Price", "54654-454df-452", 40, 16.75);
		CommissionEmployee cE = new CommissionEmployee("Sue", "John", "343-er-23-345", 342, .45);
		BasePlusCommissionEmployee bE = new BasePlusCommissionEmployee("Bob", "Lewis", "3430-3434-34-34", 343, .34, 500);
		
		System.out.println(sE+"\n");
		System.out.println(hE+"\n");
		System.out.println(cE+"\n");
		System.out.println(bE+"\n");
		
		Employee[] employees = new Employee[4];
		
		employees[0] = sE;
		employees[1] = hE;
		employees[2] = cE;
		employees[3] = bE;
		
		
		System.out.printf("Employees processed polymorphically: %n%n");
		
		for(Employee currentEmployee: employees)
		{
			System.out.println(currentEmployee);
			System.out.println();
		}
	}

}
