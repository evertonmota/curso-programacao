import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Funcionarios;
import curso_programacao.entities.FuncionariosTerceirizados;

public class PamentoDeFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees : ");
		int n = sc.nextInt();
		
		List<Funcionarios>  funcionarios = new ArrayList<>();
		
		for(int i =1; i <= n ; i++ ) {

			System.out.println("Employee #" +i + " data :");
			
			System.out.print("Outsourced ( y/n ) ? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours : ");
			int hour = sc.nextInt();
			
			System.out.print("Value PerHour : ");
			Double value = sc.nextDouble();
			
			if (outsourced == 'y') {
				System.out.println("Additional charge : " );
				double charge= sc.nextDouble();
				
				// Pode ser dar duas formas abaixo:
				// Funcionarios f = new FuncionariosTerceirizados(name, hour, value, charge);
				//funcionarios.add(f); 
				
				funcionarios.add(new FuncionariosTerceirizados(name, hour, value, charge));
			}else {
				//Funcionarios f = new Funcionarios(name, hour, value);
				//funcionarios.add(f);
				funcionarios.add(new Funcionarios(name, hour, value));
			}
		}
		System.out.println();
		System.out.println("Payments : ");
		
		for(Funcionarios f : funcionarios) {
			System.out.println(f.getNome() + " $ " + String.format("%.2f",f.payment()));
		}
		
		sc.close();
		
	}

}
