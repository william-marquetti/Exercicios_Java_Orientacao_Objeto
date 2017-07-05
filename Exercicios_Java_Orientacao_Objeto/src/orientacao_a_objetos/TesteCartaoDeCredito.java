package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartaoDeCredito {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		// criando os objetos
		CartaoDeCredito masterCard = new CartaoDeCredito("650236520143003");
		CartaoDeCredito visa = new CartaoDeCredito("4502036512123003");
		
		visa.setDataValidade(sdf.parse("08/03/2026"));
		masterCard.setDataValidade(sdf.parse("01/03/2026"));
				
		System.out.println("Mastercard: "+ masterCard.getNumero() + " valido até: "+ sdf.format(masterCard.getDataValidade()));
		System.out.println("Visa: "+ visa.getNumero() + " valido até: "+ sdf.format(visa.getDataValidade()));
		
	}
}
