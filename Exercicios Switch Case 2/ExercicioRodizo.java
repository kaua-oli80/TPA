
import java.util.Scanner;
public class ExercicioRodizo{
	
	public static void main(String[] args) {
		int placa;
		Scanner Ler =new Scanner(System.in);
		System.out.println("Insira o numero final de sua placa: ");
		placa= Ler.nextInt();
		
		switch (placa) {
		
		case 1:
		case 2:
			System.out.println("Esta placa não pode circular as segundas-feiras.");
		break;
		
		case 3:
		case 4:
			System.out.println("Esta placa não pode circular as terças-feiras.");
		break;
		
		case 5:
		case 6:
			System.out.println("Esta placa não pode circular as quartas-feiras");
		break;
		
		case 7:
		case 8:
			System.out.println("Esta placa não pode circular as quintas-feiras");
		break;
		
		case 9:
		case 0:
			System.out.println("Esta placa não pode circular as sextas-feiras.");
		break;
		default:
			System.out.println("Placa invalida.");
		}
		
		Ler.close();
	}

}