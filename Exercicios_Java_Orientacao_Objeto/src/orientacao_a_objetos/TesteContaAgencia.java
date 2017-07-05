package orientacao_a_objetos;

public class TesteContaAgencia {
	public static void main(String[] args) {
		
		
		
		Agencia ag1 = new Agencia(6255565);
		Conta conta1 = new Conta("4545454545", ag1);
		Conta conta2 = new Conta("5558787", ag1);
		conta1.setLimite(300d);
		conta1.setSaldo(565.65d); 

		conta2.setLimite(150);
		conta2.setSaldo(475.65d);	
	
		System.out.println(conta1.extrato());
		
		conta1.deposita(257.62);
		
		System.out.println();
		System.out.println("Saldo disponível: "+conta1.consultaSaldo());
		
		conta1.saque(400);
		
		System.out.println();
		System.out.println("Saldo disponível: "+conta1.consultaSaldo());
				
	}
}
