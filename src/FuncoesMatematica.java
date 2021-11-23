
public class FuncoesMatematica {

	public static void main(String[] args) {

		// Funções Aritméticas
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A , B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("Raiz quadradra de " + x + " = " + A);
		System.out.println("Raiz quadradra de " + y + " = " + B);
		System.out.println("Raiz quadradra de 25 = " + C);
		System.out.println();
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadradro = " + B);
		System.out.println("5 elevado ao quadradro = " + C);
		System.out.println();
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor Absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
	}

}
