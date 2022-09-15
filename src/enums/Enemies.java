package enums;

public enum Enemies {
	
	MEAN_PEOPLE(30),
	GOLD_DIGGER(50),
	SHATAN(75),
	JEALOUS_PEOPLE(80),
	STRANGER(10);
	
	
	
	final int levelOfHarm;
	
	Enemies(int levelOfHarm)
	{
		this.levelOfHarm = levelOfHarm;
	}

}
