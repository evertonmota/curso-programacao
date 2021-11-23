import java.util.Scanner;

public class MaiorDeTres {

	public static void main(String[] args) {

		int n1, n2, n3;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1 numero");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2 numero");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3 numero");
		n3 = sc.nextInt();

		int higher = maxNumber(n1, n2, n3);
		showMessage(higher);
		
		sc.close();
	}
	
	private static int maxNumber(int x, int y, int z) {
		int aux ;
		
		if( x > y && x > z){
			aux = x;
		}
		else if(y > x && y > z) {
			aux = y;
			
		}else {
			aux = z;
		}
		
		return aux;
	}

	public static void showMessage(int value) {
		System.out.println("O Maior numero é  : " + value);
	}
}
