package Generic;

public class By2 implements Series{
	private int val;
	
	public By2()
	{
		this.val = 5;
	}
	
	@Override
	public int getNext() {
		this.val +=2;
		return this.val;
	}
}
