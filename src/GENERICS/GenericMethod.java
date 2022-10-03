package GENERICS;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] intArray = {2,34,334,465,33};
		Double[] doubleArr = {34.34,43.00,12.3,23.34};
		Character[] charArr = {'H','U','L','K'};
		
		System.out.println("Printing int");
		printArray(intArray);
		
		System.out.println("Printing double array");
		printArray(doubleArr);
		
		System.out.println("Printing char array");
		printArray(charArr); 
		
		
	}
	
	private static <T> void printArray(T[] arr)
	{
		for(T t: arr)
			System.out.printf("%s ",t);
	}

}
