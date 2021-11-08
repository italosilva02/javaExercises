package program;

import java.util.Locale;
import java.util.Scanner;

import conta.Dados;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Dados account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit y/n ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: $ ");
			double initialDeposit = sc.nextDouble();
			account = new Dados(number, holder, initialDeposit);
		}
		
		else {
			account = new Dados(number, holder);
		}
		
		System.out.print("\n\nAccount data:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: $ ");
		double depositValue = sc.nextDouble();
		
		account.deposit(depositValue); 
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: $ ");
		double withdrawValue = sc.nextDouble();
		
		account.withdraw(withdrawValue);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
