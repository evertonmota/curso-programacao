package curso_programacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao.entities.Students;

public class StudentsRoomVector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = 10;
		
		Students[] students = new Students[n];
		
		for( int i = 0 ; i < students.length; i++) {
			
			System.out.println("Rent #" + i+1);
			
			System.out.println("Digite o primeiro nome ");
			String name = sc.nextLine();

			System.out.println("Digite o E-mail");
			String email = sc.nextLine();
			
			System.out.println("Digite o Número do Quarto");
			int room = sc.nextInt();
			
			if(students[i] != null) {
				students[room] = new Students(name, email, room);
			}
			
		}
		
		System.out.println(students );
		
		
		sc.close();
	}

}
