import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio05 {
 public static void main(String[] args) {
	 Float a = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
	 Float b = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
	 Float result = (float) (a + b)/2;
	 
	 DecimalFormat n = new DecimalFormat("##.#");
	 
	 if (result >= 6) {
		 JOptionPane.showMessageDialog(null, "APROVADO: " + n.format(result));
	 } else {
		 JOptionPane.showMessageDialog(null, "REPROVADO: " + n.format(result));
	 }
	 
	 
 }
}
