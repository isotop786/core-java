package core_concept;

public class Food {
	private String name;
	
	public Food(String name) {
		this.name = name;
	}
	
	public void foodInfo()
	{
		System.out.println("I am a "+this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
