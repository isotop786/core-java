package Composition.Detension;

public class Detainee {
	private String name;
	private int age;
	private String date;
	private Offence offence;
	
	public Detainee(String name, int age, String date, Offence offence)
	{
		this.name = name;
		this.age = age;
		this.date = date;
		this.offence = offence;
	}
	
	@Override
	public String toString()
	{
		return "Detainee is :"+this.name+"\n"+"Age: "+this.age+"\n"
				+"Offence: "+this.offence+"\nDate:"+this.date;
	}

}
