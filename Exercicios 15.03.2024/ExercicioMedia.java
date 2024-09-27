
import java.util.Scanner;
public class ExercicioMedia{
	
	public static void main(String[] args) {
		float  nota1, nota2, nota3, media;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = Ler.nextFloat();
		
		System.out.println("Digite a segunda nota nota: ");
		nota2 = Ler.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = Ler.nextFloat();
		
		media = ((nota1 + nota2 + nota3)/3);
		
		System.out.println("A média das notas aprenetadas é: " + media);
		
		Ler.close();
		
		
	}
}