
import java.util.Scanner;
public class ExercicioINSS {

	public static void main(String[] args) {
		double salariobruto, salarioliquido, inss;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o seu salario:");
		salariobruto = Ler.nextDouble();
		
		if (salariobruto>= 2500) {
			inss = salariobruto *0.11;
			salarioliquido = salariobruto - inss;
			System.out.println("O total de inss descontado é: "+ inss);
			System.out.println("O Salario após o desconto de inss é: "+ salarioliquido);
		}else {
			inss = salariobruto *0.09;
			salarioliquido = salariobruto - inss;
			System.out.println("O total de inss descontado é: "+ inss);
			System.out.println("O Salario após o desconto de inss é: "+ salarioliquido);
		}
		
		Ler.close();
	}
}