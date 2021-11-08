package exercicio1;


import java.util.Locale;
import java.util.Scanner;

import entites.product;

public class Main {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		

		product a;
		a = new product();
		
		a.w = sc.nextDouble();
		a.h = sc.nextDouble();
		
		double area = a.area();
		double peri = a.perimetro();
		double diagonal = a.diagonal();
		
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PERIMETRO: %.2f%n", peri);
		System.out.printf("DIAGONAL: %.2f%n", diagonal);


		sc.close();
		
		
		

		
	}

}
