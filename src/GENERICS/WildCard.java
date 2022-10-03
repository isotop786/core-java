package GENERICS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<> (Arrays.asList(3,4,5,32,7));
		
		List<Double> list2 = new ArrayList<>(Arrays.asList(3.2,3.4,12.3,33.3,43.3));
		
		
		System.out.println("Total sum is:"+ sum(list1));
		System.out.println("Total sum is:"+ sum(list2));
		
		
		
	}
	
	private static double sum(List<? extends Number> list)
	{
		double sum = 0.0;
		for(Number i: list)
		{
			sum += i.doubleValue();
		}
		
		return sum;
	}
	

}
