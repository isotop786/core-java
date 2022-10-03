package GENERICS;

public class MaximumTest {
	public static void main(String[] args) {
		
		System.out.printf("Maximum of 110010100,1010111010,10010111 is "+maximum(110010100, 1010111010, 10010111));
		
	}
	
	private static <T extends Comparable> T maximum(T x, T y, T z) {
		
		T max = x;
		
		if(y.compareTo(max) >0)
			max = y;
		
		if(z.compareTo(max) > 0)
			max = z;
		
		return max;
		
	}

}
