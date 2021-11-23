package curso_programacao_vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidades de pessoas para cadastrar as alturas.");
		int n = sc.nextInt();

		double[] pessoas = new double[n];
		
		int aux=1;
		for(int i=0; i <  pessoas.length; i++) {
			System.out.println("Digite a altura " + aux + " = ");
			pessoas[i] = sc.nextDouble();
			++aux;
		}
		
		double sum = 0.0;
		
		for(int i=0; i< n; i++) {
			sum+= pessoas[i];
		}

		double avg = sum /n;
		System.out.printf("A media das alturas = %.2f", avg);
		sc.close();
		
	}

}
