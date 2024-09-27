import java.util.Scanner;
public class Exercicioidade{
    
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
 
        int fe1 = 0, fe2 = 0, fe3 = 0, fe4 = 0, fe5 = 0;
        int maisVelho, maisJovem; 
 
      
        System.out.print("Digite a idade da 1 pessoa: ");
        int id = scanner.nextInt();
        maisVelho = id;
        maisJovem = id;
 
     
        if (id <= 15) {
            fe1++;
        } else if (id >= 16 && id <= 30) {
            fe2++;
        } else if (id >= 31 && id <= 45) {
            fe3++;
        } else if (id >= 46 && id <= 60) {
            fe4++;
        } else {
            fe5++;
        }
 

        int i = 1;
        while (i < 15) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            id = scanner.nextInt();
 
         
            if (id > maisVelho) {
                maisVelho = id;
            }
            if (id < maisJovem) {
                maisJovem = id;
            }
 

            if (id <= 15) {
                fe1++;
            } else if (id >= 16 && id <= 30) {
                fe2++;
            } else if (id >= 31 && id <= 45) {
                fe3++;
            } else if (id >= 46 && id <= 60) {
                fe4++;
            } else {
                fe5++;
            }
 
            i++;
        }
 
        
        int total = fe1 + fe2 + fe3 + fe4 + fe5;
 
        
        System.out.println("\nQuantidade de pessoas em cada faixa etária:");
        System.out.println("1ª Faixa (Até 15 anos): " + fe1 + " - " + ((fe1 * 100.0) / total) + "%");
        System.out.println("2ª Faixa (De 16 a 30 anos): " + fe2 + " - " + ((fe2 * 100.0) / total) + "%");
        System.out.println("3ª Faixa (De 31 a 45 anos): " + fe3 + " - " + ((fe3 * 100.0) / total) + "%");
        System.out.println("4ª Faixa (De 46 a 60 anos): " + fe4 + " - " + ((fe4 * 100.0) / total) + "%");
        System.out.println("5ª Faixa (Acima de 61 anos): " + fe5 + " - " + ((fe5 * 100.0) / total) + "%");
 
       
        System.out.println("\nIdade do mais velho: " + maisVelho);
        System.out.println("Idade do mais jovem: " + maisJovem);
 
        scanner.close();
    }
}