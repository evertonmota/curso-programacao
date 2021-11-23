import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Triangle;

public class POOTrianguloMaior {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p;
		double areaX , areaY ;
		//double resultx, resulty;
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		enterValueOf(sc, x);
		enterValueOf(sc, y);
		
		//resultx = x.CalculateArea(x);
		//resulty = y.CalculateArea(y);
	    //printMessage(resultx, resulty);
		
		areaX = x.area();
		areaY = y.area();
		
		printMessage(areaX, areaY);
		
		majorArea(areaX, areaY);
		sc.close();
	}

	private static void majorArea(double areaX, double areaY) {
		if(areaX > areaY) {
			System.out.println("Larger area : X ");
		}else {
			System.out.println("Larger area : Y ");
		}
	}
	
	private static void enterValueOf(Scanner sc, Triangle x) {
		System.out.println("Enter the measures of triangle X : ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
	}
	
	private static void printMessage(double x , double y) {
		System.out.printf("Triangle X area : %.4f%n", x);
		System.out.printf("Triangle Y area : %.4f%n", y);
	}
}	
