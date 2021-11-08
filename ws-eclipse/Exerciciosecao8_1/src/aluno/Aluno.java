package aluno;

public class Aluno {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double IncreaseSalaty(double porcentage) {
		return (grossSalary * (porcentage /100)) + netSalary();
	}

}
