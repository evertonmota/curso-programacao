import java.util.Locale;
import java.util.Scanner;

public class MediaDoisNumeros {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		double x, y, media;
		Integer a, b , soma;
		
		System.out.println("Digite o primeiro n�mero. ");
		x = sc.nextDouble();
		
		System.out.println("Digite o segundo n�mero.");
		y = sc.nextDouble();
		
		media = (x + y ) /  2.0;
		
		System.out.println("A m�dia entre os dois numeros : " + media);
		
		System.out.println("Digite um numero  -30 ");
		a = sc.nextInt();

		System.out.println("Digite um numero 10");
		b = sc.nextInt();
		
		soma = (a + b);
		
		System.out.println(soma);

		sc.close();
	}

}
