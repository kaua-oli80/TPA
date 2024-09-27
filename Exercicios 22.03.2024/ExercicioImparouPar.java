
import java.util.Scanner;
public class ExercicioImparouPar{
	
	public static void main(String[] args) {
		int resto, n;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		n = Ler.nextInt();
		
		resto = n % 2;
		
		if (resto == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		
		Ler.close();
	}

}