
import java.util.Scanner;
public class ExercicioCombustivel {
	
	public static void main(String[] args) {
		double dp, cc, gasto;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida em quilomêtros:");
		dp = Ler.nextDouble();
		System.out.println("Digite o total de combustivel gasto durante o percurso");
		cc = Ler.nextDouble();
		
		gasto = dp/cc;
		
		if (gasto >= 10) {
			System.out.println("Econômico");
		
		}else {
			System.out.println("Não econômico");
		}
		
		Ler.close();
	}

}