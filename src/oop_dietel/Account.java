package oop_dietel;

public class Account {
	private double initialBalance;
	
	public Account(double amount)
	{
		if(amount > 0.0)
			this.initialBalance = amount;
	}
	
	public void credit(double amount)
	{
		if(amount >0.0)
			this.initialBalance += amount;
	}
	
	public double getBalance()
	{
		return this.initialBalance;
	}

}
