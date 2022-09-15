package Composition;


public class Date {
	
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year)
	{
		this.month = checkMonth(month);
		this.day = checkDay(day);
		this.year = year;
		
		System.out.printf("Date object constructor for date\n", this);
		
	}
	
	private int checkMonth(int month)
	{
		if(month > 0 && month <=12)
		{
			return month;
		}
		else {
			System.out.printf("Invalid month (%d) set 1.", month);
			return 1;
		}
	}
	
	private int checkDay(int day)
	{
		int daysPerMonth []
				= {0, 31,28,31,30, 31, 30, 31,31,30,31,30,31};
		
		if(day >0 && day <= daysPerMonth[this.month]) 
		{
			return day;
		}
		
		if(this.month == 2 && this.day ==29 && (this.year %400 ==0 || (this.year %4 ==0 && this.year %100 !=0)))
		{
			return day;
		}
		System.out.printf("Invalid day %d set to 1", day);
		return 1;
					
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d", this.month, this.day, this.year);
	}
	
	
}
