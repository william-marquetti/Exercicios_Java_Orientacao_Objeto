package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteConta {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Conta conta1 = new Conta("155151");
		Conta conta2 = new Conta("45452");
		
		conta1.saldo = 1500d;
		conta1.limite = 1500.50d;
		
		conta2.saldo = 1500d;
		conta2.limite = 1050.00d;
		
		System.out.println("Conta: "+ conta1.numero + " saldo: "+ df.format(conta1.saldo) +" limite: "+ df.format(conta1.limite));
		System.out.println("Conta: "+ conta2.numero + " saldo: "+ df.format(conta2.saldo) +" limite: "+ df.format(conta2.limite));
		
		System.out.println("Conta1 saldo: "+ conta1.saldo);
		System.out.println("Conta2 saldo: "+ conta2.saldo);
		
		System.out.println("Transferido R$500 da conta1 para conta2");
		conta1.transferencia(conta2, 500d);
				
		System.out.println("Conta1 saldo: "+ conta1.saldo);
		System.out.println("Conta2 saldo: "+ conta2.saldo);
	}
}
