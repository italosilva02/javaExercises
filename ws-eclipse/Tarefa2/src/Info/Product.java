package Info;

public class Product {
	public String name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
}
