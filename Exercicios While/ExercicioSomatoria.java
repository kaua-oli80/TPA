public class ExercicioSomatoria {
    public static void main(String[] args) {
        int soma = 0; 
        int i = 1;    

        
        while (i <= 100) {
            soma += i;
            i++;       
        }

       
        System.out.println("A somat�ria dos n�meros inteiros de 1 a 100 �: " + soma);
    }
}
