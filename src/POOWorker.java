import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Department;
import curso_programacao.entities.HourContract;
import curso_programacao.entities.Worker;
import curso_programacao.enums.WorkerLevel;


public class POOWorker {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Enter department´s name : ");
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data :");
		System.out.print("Name :");
		String workerName = sc.nextLine();
		
		System.out.println("Level:");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base Salary:");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName , WorkerLevel.valueOf(workerLevel), baseSalary, new Department( departmentName));
		
		
		//quantos contratos terá este trabalhador ?
		System.out.print("How  many contracts to this worker ?");
		int n = sc.nextInt();
		
		
		for(int i=1 ; i <= n ; i++) {
			
			System.out.println("Enter contract # " + i  + " data :");
			System.out.print("Date (DD/MM/YYYY) : " );
			
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour :");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (Hour)  :");
			int hour = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hour);
			
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY) ");
		String monthYear = sc.next();
		
		int month = Integer.parseInt(monthYear.substring(0,2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.println("Name : " + worker.getName());
		System.out.println("Department : " + worker.getDepartment().getName());

		System.out.println("Income for  : " +  monthYear + " : " + String.format("%.2f", worker.income(year, month)) );

		sc.close();
	}
}
