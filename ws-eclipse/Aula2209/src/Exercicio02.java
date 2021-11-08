import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio2 {

	public static void object(String[] args) {
		
		Float p = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do peso: KG"));
		Float h = Float.parseFloat(JOptionPane.showInputDialog("Infome a altura: METROS"));
		
		float imc = p / (h * h);
		
		DecimalFormat n = new DecimalFormat("##.#");
		
		JOptionPane.showMessageDialog(null, "IMC" + n.format(imc));
		
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "MAGREZA - IMC = " + n.format(imc));
		}
		
		else if (imc >= 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "NORMAL - IMC = " + n.format(imc));
		}
		
		else if (imc >= 25.0 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "SOBREPESO - IMC = " + n.format(imc));
		}
		else if (imc >= 30.0 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null, "OBESIDADE - IMC = " + n.format(imc));
		}
		else if (imc >= 40.0 ) {
			JOptionPane.showMessageDialog(null, "OBESIDADE GRAVE - IMC = " + n.format(imc));
		}

	}

}
