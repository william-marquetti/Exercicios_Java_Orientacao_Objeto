package orientacao_a_objetos;

public class TestaAgencia {
	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia();
		
		Agencia ag2 = new Agencia();
		
		ag1.nome = "�gua Verde";
		ag1.numero = 23239;
		
		ag2.nome = "Centro";
		ag2.numero = 15156;
		
		System.out.println("Ag�ncia 1: "+ ag1.nome +" N�mero: "+ ag1.numero);
		System.out.println("Ag�ncia 2: "+ ag2.nome +" N�mero: "+ ag2.numero);
	}
}
