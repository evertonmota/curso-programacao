import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Rectangle;

public class POORectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height :");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		double area = rec.area();
		
		System.out.printf("AREA %.2f%n" , area );

		area = rec.perimeter();
		System.out.printf("PERÍMETRO %.2f%n" , area );
		
		area = rec.diagonal();
		System.out.printf("DIAGONAL %.2f%n" , area );
		sc.close();
	}
}
