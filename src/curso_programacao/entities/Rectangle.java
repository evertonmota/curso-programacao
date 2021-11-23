package curso_programacao.entities;

public class Rectangle {

	public double width;
	public double height;
	
	// Area = base * altura ; 
	public double area() {
		double area = width * height;
		return area;
	}
	
	// Area = base(2) + altura(2)
	public double perimeter() {
		double area;
		return area = (width * 2) +(2 * height ); 
	}

	// Diagonal = d(sqrt) = base(2) + altura(2)
	public double diagonal() {
		double digonal ;
		digonal  =  Math.sqrt( Math.pow(height, 2) + Math.pow(width,2 ) );
		return digonal;
	}
}
