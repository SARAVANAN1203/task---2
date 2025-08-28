package oops;

import java.util.Scanner;

public class Person {
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter your name: ");
     
     String name = scanner.nextLine();
     
     System.out.print("Enter the age : ");
     
     int age = scanner.nextInt();
     
     System.out.print("Enter your name:"+ name);
     System.out.print("Enter your age:"+ age);	 
	}

	
}
