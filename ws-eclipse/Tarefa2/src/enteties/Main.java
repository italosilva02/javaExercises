package enteties;

import java.util.Locale;
import java.util.Scanner;

import Info.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product a, b, c;
		a = new Product();
		
		System.out.println("Nome: ");
		a.name = sc.nextLine();
		System.out.println("Salário Bruto: R$ ");
		a.GrossSalary = sc.nextDouble();
		System.out.println("Desconto: R$ ");
		a.Tax = sc.nextDouble();
		
		double NetSalary = a.NetSalary();
		
		
		System.out.println("Employee: " + a.name + ", R$" + NetSalary);
		System.out.println();
		
		System.out.println("Which percentage to increase salary: ");
		double Increasesalary = sc.nextDouble();
		
		NetSalary += a.GrossSalary * ( Increasesalary / 100);
		
		System.out.println("Updated data:" + NetSalary );
		
		
		
		
		sc.close();
	}
}
