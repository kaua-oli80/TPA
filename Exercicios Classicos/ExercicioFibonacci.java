import java.util.Scanner;

public class ExercicioFibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        int a = 1, b = 1, contador = 1;
        
        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            
            System.out.print("Série de Fibonacci até o " + n + "º termo: ");
            
            while (contador <= n) {
                System.out.print(a);
                if (contador < n) {
                    System.out.print(", ");
                }
                
                int next = a + b;
                a = b;
                b = next;
                contador++;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
