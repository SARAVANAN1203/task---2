package task2;

import java.util.Scanner;

interface Taxable {
	 double SALES_TAX = 0.07;
	 double INCOME_TAX = 0.105;
	 
	 double calcTax();
 }
 
 class Employee implements Taxable{
	 private int empId;
	 private String name;
	 private double salary;
	 /**
 	 * @param empId
 	 * @param name
 	 * @param salary
 	 */
	 public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	 }
	 @Override
	 public double calcTax() {
		// TODO Auto-generated method stub
		double yearlySalary = salary * 12;
		return yearlySalary * INCOME_TAX;
	 } 
	 
 }
 
 class Product implements Taxable{
	 
	 private int pid;
	 private double price;
	 private int quantity;
	 /**
 	 * @param pid
 	 * @param price
 	 * @param quantity
 	 */
	 public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	 }
	 @Override
	 public double calcTax() {
		// TODO Auto-generated method stub
		return price * SALES_TAX;
	 }
	 
	 
 }
public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee details: ");
		
		System.out.print("Employee ID: ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Employee Name: ");
		String name = sc.nextLine();
		
		System.out.print("Monthly Salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(empId,name,salary);
		System.out.println("Income tax for " + name + "=" + emp.calcTax());
		
		
		
        System.out.println("\nEnter product details: ");
		
		System.out.print("Product ID: ");
		int pid = sc.nextInt();
		
		
		System.out.print("Unit Price: ");
		double price = sc.nextDouble();
		
		
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product prod = new Product (pid,price,quantity);
		System.out.println("Sales tax on product (per unit) = " + prod.calcTax());
		
		sc.close();
		
	}

}
