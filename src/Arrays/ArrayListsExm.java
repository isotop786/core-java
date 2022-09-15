package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsExm {
	public static void main(String[] args)
	{
		ArrayList<Integer> numList = new ArrayList<>();
		ArrayList<String> namelist = new ArrayList<String>();
		
//		adding value in order
		numList.add(0);
		numList.add(2);
		numList.add(3);
		
//		getting a specific element
		numList.get(0);
		
//		add elment in between
		numList.add(1,1);
		
//		replace an element
		numList.set(2, 4);
		
//		for(int x: numList)
//		{
//			System.out.println(x);
//		}
//		
//		Collections.sort(numList);
//		
//		
//		System.out.println(numList);
		
		namelist.add("banana");
		namelist.add("watermalon");
		namelist.add("apple");
		
		System.out.println(namelist);
		
		Collections.sort(namelist);
		System.out.println(namelist);
		
		
		
		
		
		
	}
}
