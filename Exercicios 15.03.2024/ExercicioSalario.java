
import java.util.Scanner;
public class ExercicioSalario{

	public static void main(String[] args) {
		int salario, salariofinal, auxilo, dependentes;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		salario = Ler.nextInt();
		
		System.out.println("Digite o numero de dependentes:");
		dependentes = Ler.nextInt();
		
		
		auxilo = dependentes*55;
		salariofinal = salario + auxilo;
		
		System.out.println("O seu salario, mais a soma de beneficios relacionada aos dependentes é: " + salariofinal );
		
		Ler.close();
		
	}

}
