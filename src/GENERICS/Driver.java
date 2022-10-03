package GENERICS;
import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList();
		words.add("Heldo");
		
		var val = words.get(0);
		System.out.println(val);
		
		System.out.println(val.getClass().getName());
		
		while(val !=null) {
			
			System.out.println(val);
			break;
		}
	}

}
