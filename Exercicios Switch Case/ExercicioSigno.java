
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
				System.out.println("Seu signo �: Capric�rnio");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: Aquario");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 2:
				if (dia <= 18) {
				System.out.println("Seu signo �: Aquario");	
				}else if (dia <= 29) {
				System.out.println("Seu signo �: Peixes");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 3:
				if (dia <= 19) {
				System.out.println("Seu signo �: Peixes");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: �ries");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 4:
				if (dia <= 19) {
				System.out.println("Seu signo �: �ries");	
				}else if (dia <= 30) {
				System.out.println("Seu signo �: Touro");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 5:
				if (dia <= 20) {
				System.out.println("Seu signo �: Touro");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: G�meos");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 6:
				if (dia <= 20) {
				System.out.println("Seu signo �: G�meos");	
				}else if (dia <= 30) {
				System.out.println("Seu signo �: C�ncer");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 7:
				if (dia <= 22) {
				System.out.println("Seu signo �: C�ncer");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: Le�o");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 8:
				if (dia <= 22) {
				System.out.println("Seu signo �: Le�o");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: Virgem");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 9:
				if (dia <= 22) {
				System.out.println("Seu signo �: Virgem");	
				}else if (dia <= 30) {
				System.out.println("Seu signo �: Libra");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 10:
				if (dia <= 22) {
				System.out.println("Seu signo �: Libra");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: Escorpi�o");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 11:
				if (dia <= 21) {
				System.out.println("Seu signo �: Escorpi�o");	
				}else if (dia <= 30) {
				System.out.println("Seu signo �: Sagit�rio");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			case 12:
				if (dia <= 21) {
				System.out.println("Seu signo �: Sagit�rio");	
				}else if (dia <= 31) {
				System.out.println("Seu signo �: Capric�rnio");
				}else {
			    System.out.println("Dia invalido");
				}
			break;
			
			default:
				System.out.println("M�s invalido");
			
			}
			
			Ler.close();
		}
}
