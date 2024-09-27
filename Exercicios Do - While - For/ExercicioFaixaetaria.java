import java.util.*;
public class ExercicioFaixaetaria {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int anoNasc, anoAtual, i;
    int maisVelho = 0, maisJovem = 100;

    for(i = 1; i<=10; i++){
      System.out.println("Me Diga o ano de Nascimento de uma Pessoa: ");
      anoNasc = input.nextInt();
      System.out.println("Digite o ano Atual: ");
      anoAtual = input.nextInt();

      int idade;
      idade = anoAtual - anoNasc;
      System.out.println("Sua idade é: " + idade);

      if (idade > maisVelho) {
        maisVelho = idade;
    }
      if (idade < maisJovem) {
        maisJovem = idade;
    }
    }
    System.out.println("Idade do mais velho: " + maisVelho);
    System.out.println("Idade do mais jovem: " + maisJovem);
  }
}