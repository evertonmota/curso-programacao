package curso_programacao_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da Matriz N x N ");
		int n = sc.nextInt();
		
		int[][] matriz = new int [n][n];
		
		
		for(int i=0; i< matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main Diagonal : ");
		
		for(int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ") ;
		}
		System.out.println();
		int count = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers : " +count);
	
		sc.close();
	}

}
