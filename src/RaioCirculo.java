import java.util.Locale;
import java.util.Scanner;


public class RaioCirculo {

	public static void main(String[] args) {

		// F�rmula da �rea : area = pi * raio2;
		// Programa para ler o valor do raio de um circulo.
		// Considere o valor de Pi = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// vari�veis
		double pi = 3.14159;
		double area, raio;
		
		// Entrada = 2.00    sa�da  area = 12.5664
		// Entrada = 100.64  sa�da  area = 31819.310312  
		
		System.out.println("Digite o valor do Raio");
		raio = sc.nextDouble();
		area =  pi * (Math.pow(raio,2));
		
		System.out.printf("O valor da �rea do c�rculo � %.4f : " , area);
		
		sc.close();

	}

}
