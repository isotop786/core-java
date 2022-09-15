package oop_dietel;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		Account ac1 = new Account(-5.3);
		Account ac3 = new Account(199);
		
		
		System.out.println("Balance for account 1 is :"+ac1.getBalance());
		System.out.println("Balance for account 2 is :"+ac3.getBalance());
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		
		System.out.println("Enter amount to deposit in Account 1:");
		depositAmount = input.nextDouble();
		System.out.printf("\nAdding %.2f to accont 1\n\n", depositAmount);
		ac1.credit(depositAmount);
		
		ac3.credit(-89.99);
		
		System.out.println("\nAfter credited\n");
		
		System.out.println("Balance for account 1 is :"+ac1.getBalance());
		System.out.println("Balance for account 2 is :"+ac3.getBalance());
		

	}
}
