package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartaoDeCredito {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		// criando os objetos
		CartaoDeCredito masterCard = new CartaoDeCredito("650236520143003");
		CartaoDeCredito visa = new CartaoDeCredito("4502036512123003");
		
		visa.dataValidade = sdf.parse("08/03/2026");
		masterCard.dataValidade = sdf.parse("01/03/2026");
				
		System.out.println("Mastercard: "+ masterCard.numero + " valido até: "+ sdf.format(masterCard.dataValidade));
		System.out.println("Visa: "+ visa.numero + " valido até: "+ sdf.format(visa.dataValidade));
		
	}
}
