
import java.util.Scanner;
public class ExercicioMes {
		
	public static void main(String[] args) {
		Scanner Ler =new Scanner(System.in);
		int mes;
		System.out.println("Digite o mês de sua preferência:" );
		mes= Ler.nextInt();
		
		switch (mes) {
		
		case 1:
		case 5:
		case 3:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mês possui 31 dias");
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Esse mês possui 30 dias");
		break;
		case 2:
			System.out.println("Esse mês possui 28 dias.");
		break;
		default:
			System.out.println("Mês invalido.");
		}
		
		Ler.close();
	}
}