package orientacao_a_objetos;

public class TesteCartaoDeCredito {
	public static void main(String[] args) {
		
		// criando os objetos
		CartaoDeCredito masterCard = new CartaoDeCredito();
		CartaoDeCredito visa = new CartaoDeCredito();
		
		visa.numero = 4502036512123003l;
		visa.dataValidade = "03/26";
		
		masterCard.numero = 650236520143003l;
		masterCard.dataValidade = "03/26";
				
		System.out.println("Mastercard: "+ masterCard.numero + " valido até: "+ masterCard.dataValidade);
		System.out.println("Mastercard: "+ visa.numero + " valido até: "+ visa.dataValidade);
		
	}
}
