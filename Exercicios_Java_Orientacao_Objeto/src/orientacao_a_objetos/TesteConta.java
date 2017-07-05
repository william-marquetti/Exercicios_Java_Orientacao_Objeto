package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteConta {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Conta conta1 = new Conta("155151");
		Conta conta2 = new Conta("45452");
		
		conta1.setSaldo(1500d);
		conta1.setLimite(1500.50d);
		
		conta2.setSaldo(1500d);
		conta2.setLimite(1050.00d); 
		
		System.out.println("Conta: "+ conta1.getNumero() + " saldo: "+ df.format(conta1.getSaldo()) +" limite: "+ df.format(conta1.getLimite()));
		System.out.println("Conta: "+ conta2.getNumero() + " saldo: "+ df.format(conta2.getSaldo()) +" limite: "+ df.format(conta2.getLimite()));
		
		System.out.println("Conta1 saldo: "+ conta1.getSaldo());
		System.out.println("Conta2 saldo: "+ conta2.getSaldo());
		
		System.out.println("Transferido R$500 da conta1 para conta2");
		conta1.transferencia(conta2, 500d);
				
		System.out.println("Conta1 saldo: "+ conta1.getSaldo());
		System.out.println("Conta2 saldo: "+ conta2.getSaldo());
		
		System.out.println(Conta.totalContas());
	}
}
