package product;

import java.util.Locale;
import java.util.Scanner;

import study.Aluno;

public class retangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno retangulo = new Aluno();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		
		
		sc.close();
	}

}
