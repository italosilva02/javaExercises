package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: U$ ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("\nProduct data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		product.quantity += sc.nextInt();
		
		System.out.println("\nUpdate data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be remove in stock: ");
		product.quantity -= sc.nextInt();
		
		System.out.println("\nUpdate data: " + product.toString());
		
		sc.close();
	}

}
