import java.util.Locale;
import java.util.Scanner;

public class Exercicio2001 {
 public static void main(String [] args) {
	 Scanner sc = new Scanner (System.in);
	 Locale.setDefault(Locale.US);
	 
	 
	 System.out.println("Informe o espaço percorrido: KM");
	 float s = sc.nextFloat();
	 System.out.println("Informe o tempo percorrido: ");
	 float t = sc.nextFloat();
	 
	 
	 float vm = s / t;
	 
	 System.out.printf("A velocidade média foi de: %.2f km/h", vm);
	 
	 sc.close();
	 
	 
 }
}
