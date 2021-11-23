import java.util.Locale;
import java.util.Scanner;

public class LocaleDefault {

	public static void main(String[] args) {

		double x;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		
		// 10.5 Exception in thread "main" java.util.InputMismatchException
		// porque por padrao do meu windos português 10.5 então deveria ter digitado 10,5.
		// Correção : Usar o Locale
		
		x = sc.nextDouble();
		
		System.out.println("você digitou "+ x); // Imprimiu 10.5 porque o println pega a localidade independente.
		
		System.out.printf("Você digitou %.2f" , x);
		sc.close();
	}

}
