import java.util.Scanner;

public class Exerciciomedia {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int inicio, fim, soma = 0, contador = 0;
        
        System.out.print("Digite o valor inicial: ");
        inicio = Ler.nextInt();
        
        System.out.print("Digite o valor final: ");
        fim = Ler.nextInt();
        
        int i = inicio;

        
        while (i <= fim) {
            soma += i;
            contador++;
            i++;
        }
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Intervalo inválido!");
        }
        Ler.close();
    }
}
