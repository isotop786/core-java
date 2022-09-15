package Composition.Detension;

public class Offence {
	private String name;
	
	public Offence(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
