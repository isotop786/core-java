package Final;

public class Increment {
	private int total =0;
	private final int INCRMENT;
	
	public Increment(int increment)
	{
		INCRMENT = increment;
	}
	
	public void addIncToToal()
	{
		this.total += this.INCRMENT;
	}
	
	public String toString()
	{
		return String.format("total is: %d", this.total);
	}
	
	
}
