
/*Fa�a um programa em Java que, receba do usu�rio dois n�meros inteiros, realize sua soma aritm�tica e apresente seu resultado de forma adequada e 
 * que seja clara para que recebe a mensagem.*/

import javax.swing.JOptionPane;


public class Exercicio1 {
	public static void main(String [] args) {
		
	   int a, b = 0;
	   
	   a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
	   b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero"));
	   
	   JOptionPane.showMessageDialog(null, "A soma entre " + a + " + " + b + " � igual a = " + (a+b) );
	   
	   
		 
	}

}
