import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x , y,  resultado;
		double a, b, result;
		double xx, yy , r;
		
		 System.out.println("Digite um numero.");
		 x = sc.nextDouble();
		
		 System.out.println("Digite outro numero");
		 y = sc.nextDouble();
		 
		 resultado =  (x * y ) / 3;
		 System.out.println(   x + " x " + y + " / 3  = " + resultado);
		 
		
		 System.out.println("Digite 60.");
		 a = sc.nextDouble();
			
		 System.out.println("Digite 4.");
		 b = sc.nextDouble();
		 
		 // 60 / ( (3 +2) * 4 )
		 
		 result = a /( (3 + 2) * b );
		 System.out.println(" O valor do calculo  60 / ( (3 + 2) * 4 )  = " +  result);
		 System.out.println();
		
		 System.out.println("Digite 60.");
		 xx = sc.nextDouble();
			
		 System.out.println("Digite de novo 4.");
		 yy = sc.nextDouble();
		 
		 r = xx / (3 + 2) * yy ;
		 
		 System.out.println( "O Resultado é :  " + r);
		 
		 sc.close();
	}
}
