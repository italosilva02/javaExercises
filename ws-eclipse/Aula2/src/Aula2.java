import java.util.Scanner;
import java.util.Locale; 

public class Aula2 {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", (a * c)/2);
		System.out.printf("CIRCULO: %.3f%n", 3.1415 * (Math.pow(c, 2)));
		System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c )/2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f%n", (a * b));
		
		sc.close();
	}
}