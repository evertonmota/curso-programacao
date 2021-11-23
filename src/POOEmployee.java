import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Employee;

public class POOEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Name :");
		emp.name = sc.nextLine();
		
		System.out.println("Gross Salary :");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax :");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp);
		
		System.out.println("Which percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Update data : " + emp.name +  " , $ " +emp.grossSalary);
		
	}

}
