import java.util.Locale;
import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		int x ;
		String day;
	
		Scanner sc = new Scanner(System.in);	
		 /*
		  *  1 - Domingo
		  *  2 - Segunda-Feira
		  *  3 - Terça-Feira
		  *  4 - Quarta-Feira
		  *  5 - Quinta-Feira
		  *  6 - sexta-Feira
		  *  7 - Sábado
		  */
		
		System.out.println("Digite o dia da semana.");
		x = sc.nextInt();
		
		switch (x) {
			case 1: {
				day = "Domingo";
				break;
		}
			case 2: {
				day = "Segunda-Feira";
				break;
		}

			case 3: {
				day = "Terça-Feira";
				break;
		}
		case 4: {
				day = "Quarta-Feira";
				break;
		}
		case 5: {
				day = "Quinta-Feira";
				break;
		}
		case 6: {
				day = "Sexta-Feira";
				break;
		}
		case 7: {
				day = "Sábado";
				break;
		}
		default:
			day = "Dia da semana inválido!";
			break;
		}
		System.out.println("O dia da semana escolhido foi : " + day);
	}

}
