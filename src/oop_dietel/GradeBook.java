package oop_dietel;

public class GradeBook {
	
	private  String coursename;
	
	public GradeBook(String name)
	{
		this.coursename = name;
	}
	
	public void setCourseName(String name)
	{
		this.coursename = name;
	}
	
	public String getCoureName()
	{
		return this.coursename;
	}
	
	
	public void displayMessage()
	{
		System.out.println("Welcome to the Grade Book for : \n"+getCoureName());
	}
	

}
