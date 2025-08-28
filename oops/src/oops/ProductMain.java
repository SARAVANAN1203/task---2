package oops;

import java.util.Scanner;

public class ProductMain {

	   public static double calculateTotalAmount(Product[] products) {
		   double total =0;
		   for (Product p : products) {
			   total += p.price * p.quantity;
			   }
		   return total;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner (System.in);
         Product[] products = new Product[5];
         
         for (int i=0; i<5; i++) {
        	 System.out.println("Enter details for Product" + (i+1) + ":");
        	 
        	 System.out.print("Product ID: ");
        	 
        	 int pid = scanner.nextInt();
        	 
        	 System.out.print("Price: ");
        	 
        	 double price = scanner.nextDouble();
        	 
        	 System.out.print("Quantity:");
        	 
        	 int quantity = scanner.nextInt();
        	 
        	 products[i] = new Product(pid,price,quantity);
        	 
        	 
	} 
         double maxPrice = products[0].price;
         
         int maxPricePid = products[0].pid;
         
         for (int i= 1; i<products.length; i++) {
        	 if (products[i].price >maxPrice) {
        		 
        		 maxPrice = products[i].price;
        		 
        		 maxPricePid =products[i].pid; 		 
        		
         }
        	 		 
        	 }
         System.out.println("\nProduct with highest price has PID: " + maxPricePid);
         
         double totalAmount = calculateTotalAmount(products);
         
         System.out.println("Total amount spent on all products: ₹" + totalAmount);
         
         scanner.close();
         }
         
}
