
import java.util.Scanner;
public class ExercicioAluno {
	
	public static void main(String[] args) {
		float meninos, meninas, porcentagemMeninos, porcentagemMeninas, t;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de meninos:");
		meninos = Ler.nextFloat();
		
		System.out.println("Digite o numero de meninas:");
		meninas = Ler.nextFloat();
		
		t = meninos + meninas;
		
		porcentagemMeninos = ((meninos/t)*100);
		porcentagemMeninas = ((meninas/t)*100);
		
		System.out.println("O total de alunos é: " + t);
		System.out.println("A porcentagem total de meninos na turma é: " + porcentagemMeninos);
		System.out.println("A porcentagem total de meninas na turma é: " + porcentagemMeninas);
		
		Ler.close();
		
	}

}