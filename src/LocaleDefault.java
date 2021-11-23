import java.util.Locale;
import java.util.Scanner;

public class LocaleDefault {

	public static void main(String[] args) {

		double x;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		
		// 10.5 Exception in thread "main" java.util.InputMismatchException
		// porque por padrao do meu windos portugu�s 10.5 ent�o deveria ter digitado 10,5.
		// Corre��o : Usar o Locale
		
		x = sc.nextDouble();
		
		System.out.println("voc� digitou "+ x); // Imprimiu 10.5 porque o println pega a localidade independente.
		
		System.out.printf("Voc� digitou %.2f" , x);
		sc.close();
	}

}
