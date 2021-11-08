/*Faça um programa em Java que, receba do usuário seis números de ponto flutuante de 32 bits, realize sua média aritmética e apresente seu resultado de forma adequada e que seja clara para que recebe a mensagem.​*/

import java.util.Locale;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		float a, b, c, d, e, f = 0;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Informe o 1° número: "));
		b = Float.parseFloat(JOptionPane.showInputDialog("Informe o 2° número: "));
		c = Float.parseFloat(JOptionPane.showInputDialog("Informe o 3° número: "));
		d = Float.parseFloat(JOptionPane.showInputDialog("Informe o 4° número: "));
		e = Float.parseFloat(JOptionPane.showInputDialog("Informe o 5° número: "));
		f = Float.parseFloat(JOptionPane.showInputDialog("Informe o 6° número: "));
		float result = 0;
		
		result = (a + b +c + d + e +f )/6;
		
		DecimalFormat n = new DecimalFormat("##.##");
		
		String resultado = ("A média aritmética entre os valores é: " + n.format(result));
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
