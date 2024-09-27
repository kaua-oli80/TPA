import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        
        int i = 1; //
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++; 
        }

        scanner.close();
    }
}
