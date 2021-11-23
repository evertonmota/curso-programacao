import java.util.Locale;

public class PontoFlutuante {

	public static void main(String[] args) {

		double x = 10.12345;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.2f%n",  x);
		System.out.printf("%.4f%n",  x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",  x);
		System.out.println();

		System.out.println("RESULTADO = " + x + " Metros");
		System.out.println();
		System.out.printf("Resultado = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n", nome, idade, renda);
		
	}

}
