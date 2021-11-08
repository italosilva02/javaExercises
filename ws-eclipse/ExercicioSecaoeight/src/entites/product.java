package entites;


public class product {
	public double w;
	public double h;
	
	
	public double area() {
		return w * h;
	}

             public double perimetro() {
		 return 2 * (w + h);
	 }

             public double diagonal() {
            	 double quadrado = (w * w) + (h * h);
            	 return Math.sqrt(quadrado);
	 }
             
        
	
}
