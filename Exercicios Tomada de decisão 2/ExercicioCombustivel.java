
import java.util.Scanner;
public class ExercicioCombustivel {
	
	public static void main(String[] args) {
		double dp, cc, gasto;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida em quilom�tros:");
		dp = Ler.nextDouble();
		System.out.println("Digite o total de combustivel gasto durante o percurso");
		cc = Ler.nextDouble();
		
		gasto = dp/cc;
		
		if (gasto >= 10) {
			System.out.println("Econ�mico");
		
		}else {
			System.out.println("N�o econ�mico");
		}
		
		Ler.close();
	}

}