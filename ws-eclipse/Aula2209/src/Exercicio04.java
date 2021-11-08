import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Float n1, n2;
		Float nota; 
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Informe a nota do primeiro semestre: ");
		n1 = n.nextFloat();
		
		System.out.println("Informe a nota do segundo semestre: ");
		n2 = n.nextFloat();
		
		nota = (n1 + n2)/2;
		
		if (nota >= 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
		System.out.println("Nota final: " + nota);

	}

}
