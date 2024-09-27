
import java.util.Scanner;
public class ExercicioProduto {

	public static void main(String[] args) {
		float produto, resultado, porcentagem, desconto, calc;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o preço total do produto:");
		produto = Ler.nextFloat();
		
		System.out.println("Insira o desconto do produto:");
		porcentagem = Ler.nextFloat();
		
		calc = porcentagem/100;
		desconto = produto*calc;
		resultado = produto - desconto;
		
		System.out.println("O preço do produto com desconto é: " + resultado);
		
		Ler.close();
		
	}
}