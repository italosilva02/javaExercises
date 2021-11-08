import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
 public static void main (String[] args) {
	 int cem = 0;
	 int cinquenta = 0;
	 int vinte = 0;
	 int  dez = 0;
	 int cinco = 0;
	 int dois = 0;
	 int um = 0;
	 
	 Scanner sc = new Scanner (System.in);
	 Locale.setDefault(Locale.US);
	 
	 System.out.println("Quanto deseja sacar? ");
	 Float valor = sc.nextFloat();
	 
	 
	while (valor >= 100.00) {
		valor = valor - 100;
		cem++;
	}
	
	while (valor >= 50.00) {
		valor = valor - 50;
		cinquenta++;
	}
	
	while (valor >= 20.00) {
		valor = valor - 20;
		vinte++;
	}
	
	while (valor >= 10.00) {
		valor = valor - 10;
		dez++;
	}
	
	while (valor >= 5.00) {
		valor = valor - 5;
		cinco++;
	}
	
	while (valor >= 2.00) {
		valor = valor - 2;
		dois++;
	}
	
	while (valor >= 1.00) {
		valor = valor - 1;
		um++;
	}
	
	System.out.println("Notas de cem = " + cem + "\n" + "Notas de cinquenta = "
	+ cinquenta + "\n" + "Notas de vinte = " + vinte + "\n" + "Notas de dez = " + dez + "\n" +
			"Notas de cinco = " + cinco + "\n" + "Notas de dois " + dois + "\n" + "Notas de um = " + um);
	
	
	 
 }
}
