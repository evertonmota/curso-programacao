import java.util.Scanner;

public class ForSomaDeNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int soma = 0;
		
		for(int i=0; i < 5; i++ ) {
			
			System.out.println("Digite um número.");
			x = sc.nextInt();
			
			soma += x;
		}
		System.out.println( "O valor da soma = "+ soma);
		
		sc.close();
	}

}
