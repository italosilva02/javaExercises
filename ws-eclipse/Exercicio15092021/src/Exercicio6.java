/*Faça um programa em Java que, receba do usuário dez números de ponto flutuante de 64 bits, realize sua média ponderada de pesos (1, 2, 3, 4, 5, 6, 7, 8, 9, 10) e apresente seu resultado de forma adequada e que seja clara para que recebe a mensagem.​*/

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Exercicio6 {
	public static void main (String [] args) {
		double a, b, c, d, e, f, g, h, i, j = 0f;
		
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1° número: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2° número"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3° número"));
		d = Double.parseDouble(JOptionPane.showInputDialog("Informe o 4° número"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Informe o 5° número"));
		f = Double.parseDouble(JOptionPane.showInputDialog("Informe o 6° número"));
		g = Double.parseDouble(JOptionPane.showInputDialog("Informe o 7° número"));
		h = Double.parseDouble(JOptionPane.showInputDialog("Informe o 8° número"));
		i = Double.parseDouble(JOptionPane.showInputDialog("Informe o 9° número"));
		j = Double.parseDouble(JOptionPane.showInputDialog("Informe o 10° número"));

		
		Double result = ((a+1) + (b+2) + (c+3) + (d+4) + (e+5) + (f+6) + (g+7) + (h+8) + (i+9) + (j+10))/55;
		
		DecimalFormat n = new DecimalFormat("##.###");
		String resultado = ("A soma ponderada entre os valores é = " + n.format(result));
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}