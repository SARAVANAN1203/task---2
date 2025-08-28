package oops;

public class Account {

	 private double balance;
	 
	 public Account() {
		 this.balance = 0.0;
	 }
	 
	 public Account(double initialBalance) {
		 if(initialBalance>=0) {
			 this.balance = initialBalance;
		 }
		 else {
			 System.out.println("Initial balance can't be negative. Setting to 0. ");
			 this.balance = 0.0;
		 }
	 }
	 
	 public void deposit(double amount) {
		 
		 if(amount>0) {
			 balance += amount;
			 System.out.println("₹" + amount +" deposited. ");
			 
		 }
		 else {
			 System.out.println("Deposit amount must be positive.");
		 }
		 
	 }
     public void withdraw(double amount) {
		 
		 if(amount>0) {
			if(amount<=0) {
			 balance -= amount;
			 System.out.println("₹" + amount +" Withdrawn.");	 
		 }
			else {
				System.out.println("Insufficient balance.");
			}
			 
	 }
		 
     }
     
     public void displayBalance() {
    	 System.out.println("Current balance: ₹ " + balance);
     }
     
}