package study;

public class Aluno {
	
	public double width;
	public double height ;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height );
	}
	
	public double diagonal() {
		 return Math.sqrt((width * 2) + (height * 2));
	}
	
	public String toString() {
		return ("AREA = " + String.format("%.2f", area()) + "\n" + "PERIMETER = " +  String.format("%.2f", perimeter()) + "\n" + "DIAGONAL = " +  String.format("%.2f", diagonal()));
	}
	
	

}
