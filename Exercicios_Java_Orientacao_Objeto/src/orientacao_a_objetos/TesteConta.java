package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteConta {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.numero = "155151";
		conta1.saldo = 1300.64d;
		conta1.limite = 1500.50d;
		
		conta2.numero = "45452";
		conta2.saldo = 950.32d;
		conta2.limite = 1050.00d;
		
		System.out.println("Conta: "+ conta1.numero + " saldo: "+ df.format(conta1.saldo) +" limite: "+ df.format(conta1.limite));
		System.out.println("Conta: "+ conta2.numero + " saldo: "+ df.format(conta2.saldo) +" limite: "+ df.format(conta2.limite));
		
		
	}
}
