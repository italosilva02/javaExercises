package aluno;

public class Aluno {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	String pass;
	
	public double finalNota() {
		return (n1 + n2 + n3);
	}
	
	public String status() {
		if (n1 + n2 + n3 >= 60.00) {
			pass = "PASS";
		}
		
		else {
			  pass = ("FAILED\nMISSING " + String.format("%.2f", (60.00 - finalNota())));
		}
		
		return pass;
	}
}
