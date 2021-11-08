/*Faça um programa em Java que, receba do usuário dois números de ponto flutuante de 64 bits, realize sua soma aritmética e apresente seu resultado de forma adequada e que seja clara para que recebe a mensagem.​*/

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Exercicio3 {
	public static void main (String [] args) {
		double a = 0f;
		double b = 0f;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		Double result = a + b;
		
		DecimalFormat n = new DecimalFormat("##.##");
		String resultado = ("O resultado da soma entre " + a + " + " + b + " = " + n.format(result));
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}