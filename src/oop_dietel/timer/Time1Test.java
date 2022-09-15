package oop_dietel.timer;

public class Time1Test {
	public static void main(String[] args)
	{
		Time1 t = new Time1();
		
		t.setTime(7, 21, 23);
		
		System.out.println("Time now is :"+t.toString());
		System.out.println("Time now is :"+t.toUnivesalString());
	}
}
