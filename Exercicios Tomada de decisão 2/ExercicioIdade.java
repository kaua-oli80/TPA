
import java.util.Scanner;
public class ExercicioIdade {

	public static void main(String[] args) {
		int anoatual, anonascimento, id;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		anoatual = Ler.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		anonascimento = Ler.nextInt();
		
		id = anoatual - anonascimento;
		
		if (id < 10 ) {
			System.out.println("Criança");
		}else if (id < 18) {
			System.out.println("Adolescente");
		}else if (id < 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		
		
		Ler.close();
	}
}