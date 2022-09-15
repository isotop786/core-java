package ch1;

public class Arrays {
	public static void main(String[] args)
	{
		int[] vals = {12,2,1,1,1,2};
		
		try {
		for(int x =0; x<=vals.length; x++)
		{
			for(int y =x+1; y <= vals.length; y++)
			{
				if(vals[x] == vals[y])
				{
					System.out.println(vals[x]+" has a duplicate value");
				}
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}
