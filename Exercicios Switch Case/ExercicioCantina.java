
import java.util.Scanner;
public class ExercicioCantina{

		public static void main(String[] args) {
			int c;
			Scanner Ler= new Scanner(System.in);
			System.out.println("Digite o c�digo do item do cardapio:");
			c= Ler.nextInt();
			switch (c) {
			
			case 1:
				System.out.println("Cachorro quente, pre�o: 08,00");
			break;
			
			case 2:
				System.out.println("Cheeseburger, pre�o: 12,00");
			break;
			
			case 3:
				System.out.println("X-Salada, pre�o: 15,00");
			break;
			
			case 4:
				System.out.println("Misto Quente, pre�o: 11,00");
			break;
			
			case 5:
				System.out.println("P�o na chapa, pre�o: 06,00");
			break;
			
			default:
				System.out.println("C�digo invalido.");
			}
			Ler.close();
		}
}