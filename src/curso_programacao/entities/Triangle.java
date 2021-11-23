package curso_programacao.entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	/*
	public static double CalculateArea( Triangle p) {
		double r = (p.a + p.b + p.c ) /  2.0;
		return Math.sqrt(r * ( r - p.a  ) * (r - p.b ) * (r - p.c) );
	}*/

	public double area() {
		double p =  (a + b + c) / 2.0;
		return Math.sqrt(p * ( p - a  ) * ( p - b  ) * ( p - c  ) );
	}
}
