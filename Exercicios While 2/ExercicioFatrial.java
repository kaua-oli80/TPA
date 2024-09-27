
import java.util.Scanner;
public class ExercicioFatrial {

	public static void main(String[] args) {
		int r = 1, b, exp, i = 0;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		b = Ler.nextInt();
		
		System.out.println("Digite o expoente: ");
		exp = Ler.nextInt();
		Ler.close();
		
		while (i < exp) {
		
		r *= b;
		i++;
		
		}
		System.out.println("O resultado dessa potência é: " + r);
	}
}