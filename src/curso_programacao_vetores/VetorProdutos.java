package curso_programacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.ProductVector;

public class VetorProdutos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de N Produtos desejados para cadastrar.");
		int n = sc.nextInt();
		
		ProductVector [] products = new ProductVector [n];
		
		for(int i =0; i < products.length; i++) {
			sc.nextLine();
			
			System.out.println("Digite a descrição do produto");
			String name = sc.nextLine();
			System.out.println("Digite o valor do produto");
			double price = sc.nextDouble();
			
			products[i] = new ProductVector(name, price);
			
		}
		
		double sum = 0.0;
		for(int i = 0; i < products.length; i++) {
			sum += products[i].getPreco();
		}
		double avg = sum /n;
		System.out.printf("A media dos valores = %.2f" ,avg);
		sc.close();
		
	}

}
