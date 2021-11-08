import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Float P = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu peso: KG "));
		Float h = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura: M "));
		
		Float imc = P / (h*h);
		
		DecimalFormat n = new DecimalFormat("##.#");
		
		if (imc <= 18.5) {
			JOptionPane.showMessageDialog(null, "MAGREZA - IMC " + n.format(imc));
		} else if (imc > 18.5 && imc <= 24.9 ) {
			JOptionPane.showMessageDialog(null, "NORMAL - IMC " + n.format(imc));
		} else if (imc >= 25 && imc < 29.9) {
			JOptionPane.showMessageDialog(null, "SOBREPESO - IMC " + n.format(imc));
		} else if (imc >= 30 && imc < 39.9) {
			JOptionPane.showMessageDialog(null, "OBESIDADE - IMC " + n.format(imc));
		} else if (imc > 40) {
			JOptionPane.showMessageDialog(null, "OBESIDADE GRAVE - IMC " + n.format(imc));
		}
	}
}
