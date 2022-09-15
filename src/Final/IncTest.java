package Final;

public class IncTest {

	public static void main(String[] args) {
		
		Increment inc = new Increment(3);
		
		for(int i =0;i<=3;i++)
		{
			inc.addIncToToal();
			System.out.println(inc);
		}

	}

}
