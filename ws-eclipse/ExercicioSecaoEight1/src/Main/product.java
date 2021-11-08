package Main;

public class product {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	
		public double NetSalary() {
			return (GrossSalary - Tax);
		}
		
	
}
