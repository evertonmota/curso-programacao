package curso_programacao_vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.EmployeeList;

public class CalculateSalaryEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeList> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered ? ");
		int n = sc.nextInt();
		
		
		for(int i=0;i < n; i++) {
			
			System.out.println("");
			System.out.println("Employee # " + (i + 1) +" : ");
			
			System.out.println("Id : ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again.");
				id = sc.nextInt();
			}
			
			System.out.println("Name : ");
			String name = sc.nextLine();

			sc.nextLine();
			System.out.println("Salary : ");
			Double salary= sc.nextDouble();
			
			EmployeeList emp = new EmployeeList(id, name, salary);
			
			list.add(emp);
		}
		System.out.println();
		System.out.println("Enter the employee ID  that will have salary increase : ");
		int idSalary = sc.nextInt();
		
		EmployeeList employee = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idSalary); 

		if(employee == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent);
			employee.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of Employees : ");
		
		
		for(EmployeeList emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
		
	}
	public static boolean hasId(List<EmployeeList> ids, int id) {
		EmployeeList e = ids.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return e != null;
	}
/*
	public static Integer position(List<EmployeeList> ids, int id) {
		
		for (int i=0; i < ids.size(); i++) {
			if(ids.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
*/
}
