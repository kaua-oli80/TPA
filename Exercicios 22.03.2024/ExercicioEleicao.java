
import java.util.Scanner;
public class ExercicioEleicao {

	public static void main(String[] args) {
		int idade, anonascimento, anoeleicao;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento:");
		anonascimento = Ler.nextInt();
		
		System.out.println("Digite o ano da eleição:");
		anoeleicao = Ler.nextInt();
		
		idade = anoeleicao - anonascimento;
		
		if (idade < 16) {
			System.out.println("Você terá " + idade + " anos, e não esta apto a votar.");
		}else {
			System.out.println("Você terá " + idade + " anos, e esta apto a votar.");
		}
		
		Ler.close();
	}
}