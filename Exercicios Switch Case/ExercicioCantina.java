
import java.util.Scanner;
public class ExercicioCantina{

		public static void main(String[] args) {
			int c;
			Scanner Ler= new Scanner(System.in);
			System.out.println("Digite o código do item do cardapio:");
			c= Ler.nextInt();
			switch (c) {
			
			case 1:
				System.out.println("Cachorro quente, preço: 08,00");
			break;
			
			case 2:
				System.out.println("Cheeseburger, preço: 12,00");
			break;
			
			case 3:
				System.out.println("X-Salada, preço: 15,00");
			break;
			
			case 4:
				System.out.println("Misto Quente, preço: 11,00");
			break;
			
			case 5:
				System.out.println("Pão na chapa, preço: 06,00");
			break;
			
			default:
				System.out.println("Código invalido.");
			}
			Ler.close();
		}
}