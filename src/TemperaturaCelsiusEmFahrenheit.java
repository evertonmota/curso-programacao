import java.util.Locale;
import java.util.Scanner;

public class TemperaturaCelsiusEmFahrenheit {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double f ;
		double c ;
		char resp;		
		do{
			System.out.println("Digite a temperatura em Celsius : ");
			c = sc.nextDouble();
			f = ( 9.0 * c / 5.0 + 32);
			System.out.printf("Equivalente em Fahernheit: %.2f%n" , f);
			System.out.println("Deseja repetir (s/n) ");
			resp = sc.next().toUpperCase().charAt(0);
		}while(resp != 'n');
		sc.close();
	}

}
