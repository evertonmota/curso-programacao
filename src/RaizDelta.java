import java.util.Scanner;

public class RaizDelta {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		
		double x1, x2, delta ;
		double a, b , c ;
		
		// Exemplo
		
		// x2 -4x +32 = 0
		// 5x +2x +0 = 0
		
		System.out.println("Digite o valor de a");
		a = cs.nextDouble();
		
		System.out.println("Digite o valor de b");
		b = cs.nextDouble();
		
		System.out.println("Digite o valor de c");
		c = cs.nextDouble();
		System.out.println();
		
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		System.out.println();
		
				if(delta < 0 ) {
					System.out.println("O valor da Raiz Quadrada de Delta é : " + delta + " Não pode ser negativo.");
				}
				else if(delta == 0) {
					x1 =( (-b) / (2 * a));
					System.out.println("O valor de Delta foi : " + delta);
					System.out.println( "O valor de X1 = " + x1);
					System.out.println();
				}else {
					
					System.out.println("O valor de Delta foi : " + delta);
					System.out.println();
					
					x1 = (-b + Math.sqrt(delta) )/ 2 * a;
					System.out.println( "O valor de X1 = " + x1);
					System.out.println();
					
					x2 =( (-b) - Math.sqrt(delta)) / 2 * a;
					System.out.println("O valor de X2 = " + x2);
				}
	}
}
