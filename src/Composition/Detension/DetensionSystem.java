package Composition.Detension;

import java.util.Scanner;

public class DetensionSystem {
	public static void main(String[] args)
	{
		DetensionList dl = new DetensionList();
		Scanner input = new Scanner(System.in);
		
		dl.addDetension();
		dl.addDetension();
		dl.addDetension();
		
		dl.display();
	}
}
