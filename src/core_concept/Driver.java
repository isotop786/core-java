package core_concept;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println("working on cupling");
//		System.out.println(d.getDate());
		
		if(d.getDay() ==6 || d.getDay() ==7)
		{
			System.out.println("Happy Weekend");
		}
		
		Subject sub = new Subject();
		
//		sub.study();
		
		Volume vl = new Volume();
		vl.getVolume();
		
		int val = 299;
		boolean OverHundrad =false;
		

		
		
	}

}
