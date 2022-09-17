package Polymorphism;

public class PayableInterfaceTest {
	public static void main(String[] args) {
		
		Payable[] payableObjects = new Payable [4];
		
		payableObjects[0] = new Invoice("0233", "seat", 3, 423.14);
		payableObjects[1] = new Invoice("43322", "tire", 4, 94.33);
		payableObjects[2] = new SalariedEmployee("Jhon", "Smigla", "3304-3342-44", 849.00);
		payableObjects[3] = new HourlyEmployee("Someila", "Cko", "23-422-1342", 69, 3);
		
		System.out.println("Invoices and Employees processed polymorphocally:\n");
		
		for(Payable currentPayable : payableObjects)
		{
			System.out.printf("%s"
					+ "\npayment due:$%.2f", currentPayable.toString(),currentPayable.getPaymentAmount());
			System.out.println();
			System.out.println("-----------------------");
		}
		
	}

}
