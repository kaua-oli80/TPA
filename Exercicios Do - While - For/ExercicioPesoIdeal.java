import java.util.*;
public class ExercicioPesoIdeal {
  public static void main(String[] args) {
    String sexo, resposta;
    double altura, pesoIdeal;

    Scanner input = new Scanner(System.in);

    do{
    System.out.println("Digite o seu Genero (M para Masculino ou F para Feminino): ");
    sexo = input.next();
    System.out.println("Digite a sua altura (em metros): ");
    altura = input.nextDouble();

      if (sexo.equalsIgnoreCase("M")){
        pesoIdeal = (52 + (0.75 * ((altura * 100) - 152.4)));
        System.out.printf("O seu peso é %.2f\n", pesoIdeal);
      }else if (sexo.equalsIgnoreCase("F")){
        pesoIdeal = (52 + (0.67 * ((altura * 100) - 152.4)));
        System.out.printf("O seu peso é %.2f\n", pesoIdeal);
      }

      System.out.println("Deseja continuar? (S para Sim N para Não): ");
      resposta = input.next();
    }while (resposta.equalsIgnoreCase("S"));
  }
}