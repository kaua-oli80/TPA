
import java.util.Scanner;
public class ExercicioPrimo {

	public static void main(String[] args) {
		int divisores = 2, numero, i = 0;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Apresente um numero inteiro");
		numero = Ler.nextInt();
		
		
		while(divisores < numero) {
			if (numero % divisores == 0) {
				i++;
			}
			divisores++;
		} 
		if (numero == 1) {
			System.out.println("O n�mero n�o � primo");
		} else if (i == 0) {
            System.out.println("O n�mero � primo.");
        } else {
            System.out.println("O n�mero n�o � primo.");
        }
        
        Ler.close(); 
	}
}