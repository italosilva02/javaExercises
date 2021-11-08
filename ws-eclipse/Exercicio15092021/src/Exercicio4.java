/*Faça um programa em Java que, receba do usuário quatro números inteiros longos, realize sua média aritmética e apresente seu resultado de forma adequada e que seja clara para que recebe a mensagem. ​*/

import java.util.Locale;
import javax.swing.JOptionPane;


public class Exercicio4 {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		
		long a, b = 0;
		
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
			
			JOptionPane.showMessageDialog(null, "A média aritimetica entre " + a + " + " + b + " = " + (a+b)/2);
	}
}
