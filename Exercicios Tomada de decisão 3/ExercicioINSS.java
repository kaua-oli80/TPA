
import java.util.Scanner;
public class ExercicioINSS{

	public static void main(String[] args) {
	
		Scanner Ler= new Scanner(System.in);
		Double salario, aliquota;
		System.out.println("Informe a sua renda:");
		
		salario= Ler.nextDouble();
		
		if (salario<= 1420.00) {
		aliquota =(salario*0.075);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else if (salario<= 2666.68 ) {
		aliquota= (salario*0.09);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else if (salario<= 4000.03) {
		aliquota= (salario*0.12);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else if (salario<= 7786.02) {
		aliquota= (salario*0.14);
		System.out.println("O valor a ser recolhido é:" + aliquota);
		} else {
		aliquota= (salario*0.16);
		}
		
		Ler.close();
		
		System.out.println("O valor a ser recolhido é:" + aliquota);
	}
}