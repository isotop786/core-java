package Arrays;

public class arrays {
	public static void main(String[] args)
	{
//		int[] array;
//		array = new int[] {23,34,2};
//		
//		System.out.printf("%s%8s\n","Index","Value");
//		
//		for(int c =0; c < array.length; ++c)
//		{
////			System.out.printf("%5d%8d\n", c,array[c]);
//			Integer x = array[c];
//			System.out.println(x.hashCode());
//		}
		
		int[] arr = new int[5];
		arr[0] = 4;
		String[] cars = new String[5];
		cars[0]="Audi";
		cars[1]="BNW";
		cars[2]="Volkswagon";
		
//		for(int i=0;i<cars.length;i++)
//		{
//			System.out.println(cars[i]);
//		}
		
		for(String i: cars)
		{
			System.out.println(i);
		}
		
		
	}
	
	

	
}
