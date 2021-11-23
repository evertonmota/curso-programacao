import java.util.Scanner;

public class WhileSomaDeNumeros {

	public static void main(String[] args) {

		// Lê numeros inteiros ate que um zero seja lido. Ao final mostrar a soma dos numeros.
		
		int n1 = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		while (n1 != 0) {
			System.out.println("Digite um numero ate for um zero");
			n1= sc.nextInt();
			sum+= n1;
		}
		System.out.println();
		System.out.println("O resultado da soma dos numero = " +sum);
		sc.close();
	}

}
