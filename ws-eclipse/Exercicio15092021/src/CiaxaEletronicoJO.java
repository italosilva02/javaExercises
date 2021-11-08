import javax.swing.JOptionPane;

public class CiaxaEletronicoJO {
	
	public static void main(String [] args) {
		
		
		 int cem = 0;
		 int cinquenta = 0;
		 int vinte = 0;
		 int  dez = 0;
		 int cinco = 0;
		 int dois = 0;
		 int um = 0;
		
		int senha = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua senha: "));
		
		
		
			
			
			for (int i = 3; senha != 1234; i--) {
			JOptionPane.showMessageDialog(null, "Senha incorreta");
			JOptionPane.showMessageDialog(null, "Você ainda tem " + i + " tentativas.");
			senha = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua senha: "));
			 if (i == 1) {
				 System.exit(0);
			 }
			}
			
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade que deseja sacar:  R$"));
			
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
			
			
			JOptionPane.showMessageDialog(null, "Notas de cem = " + cem + "\n" + "Notas de cinquenta = "
	                                           + cinquenta + "\n" + "Notas de vinte = " + vinte + "\n" + "Notas de dez = " + dez + "\n" +
			                                   "Notas de cinco = " + cinco + "\n" + "Notas de dois " + dois + "\n" + "Notas de um = " + um);

			
		}

}
