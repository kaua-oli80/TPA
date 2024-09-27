
import java.util.Scanner;
public class ExercicioEscolinha{

		public static void main(String[] args) {
			int id;
			Scanner Ler= new Scanner(System.in);
			System.out.println("Informe a idade do aluno");
			id= Ler.nextInt();
			switch (id) {
		
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Sua categoria é: Dente de leite");
			break;
		
			case 7:
				System.out.println("Sua categoria é: Júnior");
			break;
		
			case 8:
				System.out.println("Sua categoria é: Júnior Max");
			break;
		
			case 9:
				System.out.println("Sua categoria é: Júnior Master");
			break;
		
			case 10:
				System.out.println("Sua categoria é: Master");
			break;
		
			default:
				System.out.println("Idade não aceitavel");
			}
			Ler.close();
		}
}