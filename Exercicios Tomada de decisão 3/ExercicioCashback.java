
import java.util.Scanner;
public class ExercicioCashback {
	
	public static void main (String[] args){
	
		Scanner Ler = new Scanner(System.in);
		Double compra, cashback;
		System.out.println ("coloque o valor da compra:");
		
		compra =Ler.nextDouble();
		if(compra<= 100) {
		cashback = (compra*0.05);
		System.out.println("Seu cashback é:" + cashback );
		} else if (compra<= 1000) { 
		cashback = (compra*0.08);
		System.out.println("Seu cashback é:" + cashback );
		} else if (compra<= 2000) { 
		cashback = (compra*0.10);
		System.out.println("Seu cashback é:" + cashback );
		} else if (compra<= 5000) {
		cashback = (compra*0.125);
		System.out.println("Seu cashback é:" + cashback );
		} else { 
		cashback = (compra*0.15);
		}
		Ler.close();
		System.out.println("Seu cashback é:" + cashback ); 
	} 
}
