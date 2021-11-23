import java.util.Locale;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double x = 0.00;
		
		System.out.println("Digite o valor para receber o desconto");
		double preco = sc.nextDouble();
		
		/*
		 * if (preco < 20.0){
		 * 		desconto = preco * 0.1;
		 * }else{
		 * 		desconto = preco * 0.05;
		 * }
		 */
		double desconto = (preco < 25.0 ) ? preco * 0.1 : preco * 0.05;

		System.out.printf("O valor do desconto foi R$ %.2f: ", desconto);
		sc.close();
	}

}
