package enums;

import enums.EnumClass.DaysOfWeek;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaysOfWeek day = DaysOfWeek.SUNDAY;
		
		if(day== DaysOfWeek.SUNDAY)
			System.out.println("Yay it's weekend.");
		
//		for(DaysOfWeek myDay: DaysOfWeek.values()){
//			System.out.println(myDay);
//		}
		
		for(Enemies en: Enemies.values())
		{
			System.out.println(en+"--"+en.levelOfHarm);
			
			if(en.levelOfHarm >=50)
			{
				System.out.println("Always stay away from "+en);
				System.out.println();
			}
		}
		
	}
	

}
