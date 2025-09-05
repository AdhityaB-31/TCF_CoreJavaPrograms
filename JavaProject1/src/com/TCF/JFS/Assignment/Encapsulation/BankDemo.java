package com.TCF.JFS.Assignment.Encapsulation;

public class BankDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BankAccount account = new BankAccount("31205", "Adhitya",500.0);

	        // Display initial details
	        account.displayAccountInfo();

	        // Deposit money
	        account.deposit(700.0);

	        // Withdraw money
	        account.withdraw(200.0);

	        // Try withdrawing more than balance
	        account.withdraw(2000.0);

	        // Display final details
	        account.displayAccountInfo();

	}
}
