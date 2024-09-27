
import java.util.Scanner;

public class ExercicioSigno{

		public static void main(String[] args) {
			int dia, mes;
			Scanner Ler= new Scanner(System.in);
			
			System.out.println("Informe o mes:");
			mes=Ler.nextInt();
			System.out.println("Informe o numero do dia:");
			dia=Ler.nextInt();
			
			switch (mes) {
			
			case 1:
				if (dia <= 19) {
				System.out.println("Seu signo é: Capricórnio");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Aquario");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 2:
				if (dia <= 18) {
				System.out.println("Seu signo é: Aquario");	
				}else if (dia <= 29) {
				System.out.println("Seu signo é: Peixes");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 3:
				if (dia <= 19) {
				System.out.println("Seu signo é: Peixes");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Áries");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 4:
				if (dia <= 19) {
				System.out.println("Seu signo é: Áries");	
				}else if (dia <= 30) {
				System.out.println("Seu signo é: Touro");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 5:
				if (dia <= 20) {
				System.out.println("Seu signo é: Touro");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Gêmeos");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 6:
				if (dia <= 20) {
				System.out.println("Seu signo é: Gêmeos");	
				}else if (dia <= 30) {
				System.out.println("Seu signo é: Câncer");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 7:
				if (dia <= 22) {
				System.out.println("Seu signo é: Câncer");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Leão");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 8:
				if (dia <= 22) {
				System.out.println("Seu signo é: Leão");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Virgem");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 9:
				if (dia <= 22) {
				System.out.println("Seu signo é: Virgem");	
				}else if (dia <= 30) {
				System.out.println("Seu signo é: Libra");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 10:
				if (dia <= 22) {
				System.out.println("Seu signo é: Libra");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Escorpião");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 11:
				if (dia <= 21) {
				System.out.println("Seu signo é: Escorpião");	
				}else if (dia <= 30) {
				System.out.println("Seu signo é: Sagitário");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 12:
				if (dia <= 21) {
				System.out.println("Seu signo é: Sagitário");	
				}else if (dia <= 31) {
				System.out.println("Seu signo é: Capricórnio");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			default:
				System.out.println("Mês invalido");
			
			}
			
			Ler.close();
		}
}
