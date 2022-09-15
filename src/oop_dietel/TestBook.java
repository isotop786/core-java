package oop_dietel;
import java.util.Scanner;


public class TestBook {
	public static void main(String[] args)
	{
		GradeBook gb1 = new  GradeBook("Java OOP");
		GradeBook gb2 = new GradeBook("Data Structure and Algorithm in Java");
		
		gb1.displayMessage();
		System.out.println();
		gb2.displayMessage();


	}
}
