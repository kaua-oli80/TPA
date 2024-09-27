
import java.util.Scanner;
public class ExercicioDivida {

	public static void main(String[] args) {
		float salario, divida, saldo;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salario:");
		salario = Ler.nextFloat();
		
		System.out.println("Insira o valor de suas dividas:");
		divida = Ler.nextFloat();
		
		saldo = salario - divida;
		
		if (saldo >= 0) {
			System.out.println("Pode dormir, sem nenhuma divida, seu saldo após o calculo é: " + saldo);
		}else {
			System.out.println("Comece a rezar, voce tem dividas , sua divida após o calculo é: " + saldo);
		}
		
		Ler.close();
	}
}