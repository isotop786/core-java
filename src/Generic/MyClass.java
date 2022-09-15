package Generic;

public class MyClass <T>{
	T var;
	
	public MyClass(T obj) {
		this.var = obj;
	}
	
	public void printer()
	{
		System.out.println("Value is: "+this.var);
		System.out.println("Type is "+this.var.getClass().getName());
	}
}
