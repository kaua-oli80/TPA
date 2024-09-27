
public class ExercicioAltura {

	public static void main(String[] args) {
		double alturaJoao = 134.0, alturaPedro = 145.0;
		
		int i = 0;
		
		while (alturaJoao <= alturaPedro) {
			
			alturaJoao += 2.5;
			alturaPedro += 2.0;
		
			i++;
		}
		System.out.println("João ira ultrapassar Pedro na altura em " + i + " anos");
		System.out.println("Altura final de João: " + alturaJoao);
		System.out.println("Altura final de pedro: " + alturaPedro);
	}

}