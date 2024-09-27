
import java.util.Scanner;
public class ExercicioNotas {

		public static void main(String[] args) {
			String nota;
			int mb, b, r, i, t;
			double porc;
			Scanner Ler= new Scanner(System.in);
			
				System.out.println("Alunos que tiraram MB:");
				mb= Ler.nextInt();
				System.out.println("Alunos que tiraram B:");
				b= Ler.nextInt();
				System.out.println("Alunos que tiraram R:");
				r= Ler.nextInt();
				System.out.println("Alunos que tiraram I:");
				i= Ler.nextInt();
				
				t=mb+b+r+i;
				
				System.out.println("Insira o seguimento de nota(mb, b, r ou i) que deseja saber a estatistica da turma:");
				nota= Ler.next();
				
				switch (nota)  { 
				
				case "mb":
				case "Mb":
				case "MB":
				case "muito bom":
				case "Muito bom":
				case "Muito Bom":
				case "MUITO BOM":
					porc=((double)mb/t)*100;
					System.out.println("A porcentagem de alunos que tiraram MB é igual a:" + porc);
				break;
				
				case "b":
				case "B":
				case "bom":
				case "Bom":
				case "BOM":
					porc=((double)b/t)*100;
					System.out.println("A porcentagem de alunos que tiraram B é igual a:" + porc);
				break;
				
				case "r":
				case "R":
				case "regular":
				case "Regular":
				case "REGULAR":
					porc=((double)r/t)*100;
					System.out.println("A porcentagem de alunos que tiraram R é igual a:" + porc);
				break;
				
				case "i":
				case "I":
				case "irregular":
				case "Irregular":
				case "IRREGULAR":
					porc=((double)i/t)*100;
					System.out.println("A porcentacem de alunos que tiraram I é igual a:" + porc);
				break;
				
				default:
					System.out.println("Nota invalida.");
				}
				
				Ler.close();
		}
}