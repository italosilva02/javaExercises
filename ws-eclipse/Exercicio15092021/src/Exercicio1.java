
/*Faça um programa em Java que, receba do usuário dois números inteiros, realize sua soma aritmética e apresente seu resultado de forma adequada e 
 * que seja clara para que recebe a mensagem.*/

import javax.swing.JOptionPane;


public class Exercicio1 {
	public static void main(String [] args) {
		
	   int a, b = 0;
	   
	   a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
	   b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
	   
	   JOptionPane.showMessageDialog(null, "A soma entre " + a + " + " + b + " é igual a = " + (a+b) );
	   
	   
		 
	}

}
