import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Account;

public class POOAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.println(" Enter Account Number :");
		int number = sc.nextInt();
		
		System.out.println(" Enter Account Holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println(" Is the an initiaL deposit ( y / n ) ?");
		char resp = sc.next().charAt(0);

		if(resp == 'y') {
			System.out.println("Enter initial deposit value : ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder,initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data :");
		System.out.println(account);

		//Deposit
		System.out.println();
		System.out.println("Enter a deposit value : ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data : ");
		System.out.println(account);
		
		//Withdraw
		System.out.println();
		System.out.println("Enter a Withdraw value : ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update account data : ");
		System.out.println(account);
		
		
		sc.close();
	}
}
