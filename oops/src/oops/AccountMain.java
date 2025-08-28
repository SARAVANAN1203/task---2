package oops;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Enter initial balance (or 0 for default: ");
   
   double initialBalance = scanner.nextDouble();
   
   Account acc;
   if(initialBalance>0) {
	   acc = new Account(initialBalance);
	   
   }
   else {
	   acc = new Account();
   }
   acc.displayBalance();
   
   
   System.out.print("Enter amount to Deposit: ");
   
   double depositAmount = scanner.nextDouble();
     acc.deposit(depositAmount);
     
     System.out.print("Enter amount to Withdraw: ");
     
     double withdrawAmount = scanner.nextDouble();
       acc.withdraw(withdrawAmount);
       
       acc.displayBalance();
       
       scanner.close();
       
   
	}

}
