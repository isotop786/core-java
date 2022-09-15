package enums;

public class EnumClass {
	public enum DaysOfWeek{
		FRIDAY,STATRDAY,SUNDAY,MONDAY,TUESDAY,WEEDNESSDAY,THURSDAY;
	}
	
	private DaysOfWeek currentDay;
	
	public EnumClass()
	{
		this.currentDay = DaysOfWeek.WEEDNESSDAY;
	}
	
	
}
