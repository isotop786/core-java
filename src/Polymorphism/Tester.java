package Polymorphism;

public class Tester {
	public static void main(String[] args) {
//		SalariedEmployee sE = new SalariedEmployee("Box", "unBox", "3D4FF3", 340);
//		
//		System.out.println(sE);
		
//		HourlyEmployee houlyE = new HourlyEmployee("John", "Deo", "JD34", 52, 5);
//		
//		System.out.println(houlyE);
		
//		CommissionEmployee ce = new CommissionEmployee("Janny", "Smith", "SJ230042", 120, .25);
//		System.out.println(ce);
		
		BasePlusCommissionEmployee bpc = new BasePlusCommissionEmployee("John", "Eldf", "JD#3434", 342, .45, 500);
		
		System.out.println(bpc);
	}
}
