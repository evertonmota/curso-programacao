import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.ProductFake;

public class POOProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data :");
		System.out.print("Name : ");
		String name = sc.nextLine();
		
		System.out.println("Price : ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity in stock : ");
		int quantity = sc.nextInt();
		
		ProductFake product = new ProductFake(name, price, quantity);

		System.out.println( product );
		System.out.println();
		
		
		System.out.println("Enter the number of product to be added in stock :");
		int qtde = sc.nextInt();
		product.addProduct(qtde);;
		
		System.out.println( product );

		System.out.println("Enter the number of product to be removeded from stock :");
		qtde = sc.nextInt();
		product.removeProduct(qtde);;
		
		System.out.println( product );
		
		sc.close();
	}

}
