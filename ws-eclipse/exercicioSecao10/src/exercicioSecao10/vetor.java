package exercicioSecao10;


import java.util.Locale;
import java.util.Scanner;

public class vetor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int n =sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe a altura");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		sum = sum/n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f", sum);
		
		
		sc.close();
	}

}
