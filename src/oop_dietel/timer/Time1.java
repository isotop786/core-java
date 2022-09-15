package oop_dietel.timer;

public class Time1 {
	
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int hour, int minute, int second)
	{
		this.hour = ((hour >= 0 && hour <24) ? hour :0);
		this.minute = ((minute >= 0 && minute < 60) ? minute : 0);
		this.second = ((second >= 0 && second < 60) ? second : 0);
	}
	
	public String toUnivesalString()
	{
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",
		((this.hour == 0 || this.hour ==12)? 12 :this.hour %12),
		this.minute, this.second, (this.hour < 12 ? "AM" : "PM")
				);
	}
}
