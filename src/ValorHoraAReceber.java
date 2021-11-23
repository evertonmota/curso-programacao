import java.util.Locale;
import java.util.Scanner;

public class ValorHoraAReceber {

	public static void main(String[] args) {

		double  valorHora;
		Integer codigoFuncionario;
		double salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o numero do Funcionário");
		codigoFuncionario = sc.nextInt();
		
		System.out.println("Digite o valor da hora a receber");
		valorHora = sc.nextDouble();
		
		salario = valorHora * 100.00;
		
		System.out.printf( " O Funcionário " + codigoFuncionario+ " tem o salário a receber de =  %.2f" , salario);
		sc.close();

	}

}
