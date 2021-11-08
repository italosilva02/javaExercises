package program;

import java.util.Locale;
import java.util.Scanner;

import aluno.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("NAME: ");
		aluno.name = sc.nextLine();
		System.out.print("1 NOTA: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("2 NOTA: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("3 NOTA: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.println(aluno.name + " = " + String.format("2.%f", aluno.finalNota()));
		System.out.println(aluno.status());
		
		sc.close();

	}

}
