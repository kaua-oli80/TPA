
import java.util.Scanner;
public class ExercicioMultiplo {

	public static void main(String[] args) {
		int n, resto;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		n = Ler.nextInt();
		
		resto = n % 10;
		
		if (resto == 0) {
			System.out.println("É multiplo de 10");
		}else {
			System.out.println("Não é multiplo de 10");
		}
		
		Ler.close();
	}
}