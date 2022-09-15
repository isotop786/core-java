package Composition.Detension;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DetensionList {
	ArrayList<Detainee> dList = new ArrayList<>();
	
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	
	public void addDetension()
	{
		String name, date,offence;
		int age;
		
		try {
			System.out.print("Enter Detainee name: ");
			name = input.next();
			
			System.out.println("Enter Detainee age: ");
			age = input.nextInt();
			
			System.out.println("Enter Offence: ");
			offence = input.next();
			
			Offence of = new Offence(offence);
			
			System.out.println("Enter Date : ");
			date = input.next();
			
			Detainee dtainee = new Detainee(name, age, date, of);
			
			dList.add(dtainee);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}
	
	public void display()
	{
		for(Detainee dl:dList)
		{
			System.out.println("---------------------------------");
			System.out.println(dl);
			System.out.println("---------------------------------");
		}
	}
	
}
