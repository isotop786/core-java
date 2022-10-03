package GENERICS;

public class Animal {
	private String _name;
	
	public Animal()
	{
		
	}
	
	public Animal(String name) {
		this._name = name;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s ] Name: %s\n", getClass().getName(), _name);
	}

}
