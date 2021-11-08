package programa;

import java.util.Locale;
import java.util.Scanner;

import aluno.Aluno;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		System.out.print("Gross salary: ");
		aluno.grossSalary = sc.nextDouble();
		System.out.print("Taxa: ");
		aluno.tax = sc.nextDouble();
		
		
		System.out.print("Employee: " + aluno.name + ", " + aluno.netSalary());
		
		System.out.print("\n\nWhitch percentage to increase salary? ");
		
		double porcentage = sc.nextDouble();
		
		System.out.print("\n\nEmployee: " + aluno.name + ", " + String.format("%.2f", aluno.IncreaseSalaty(porcentage)));
		
		
		
		sc.close();
	}
}
