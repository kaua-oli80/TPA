
import java.util.Scanner;
public class ExercicioProduto {

	public static void main(String[] args) {
		float produto, resultado, porcentagem, desconto, calc;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o pre�o total do produto:");
		produto = Ler.nextFloat();
		
		System.out.println("Insira o desconto do produto:");
		porcentagem = Ler.nextFloat();
		
		calc = porcentagem/100;
		desconto = produto*calc;
		resultado = produto - desconto;
		
		System.out.println("O pre�o do produto com desconto �: " + resultado);
		
		Ler.close();
		
	}
}