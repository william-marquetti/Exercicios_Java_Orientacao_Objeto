package orientacao_a_objetos;

public class TestaAgencia {
	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia(23239);
		
		Agencia ag2 = new Agencia(15156);
				
		System.out.println("Agência 1: "+ ag1.numero);
		System.out.println("Agência 2: "+ ag2.numero);
	}
}
