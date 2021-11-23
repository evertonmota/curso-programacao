import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {

		Integer a,b,c,d;
		Integer diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		// A diferença = (A * B - C * D) 
		
		System.out.println("Digite o valor de 5 ");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de 6 ");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de 7 ");
		c = sc.nextInt();
		
		System.out.println("Digite o valor de 8 ");
		d = sc.nextInt();
		
		System.out.println("A diferença deve ser = -26");
		
		diferenca = ( a * b -c *d);
		
		System.out.println(diferenca);
		sc.close();

	}

}
