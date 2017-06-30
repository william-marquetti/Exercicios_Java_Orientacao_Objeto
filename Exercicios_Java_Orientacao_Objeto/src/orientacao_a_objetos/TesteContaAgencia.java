package orientacao_a_objetos;

public class TesteContaAgencia {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Agencia ag1 = new Agencia();
		
		ag1.numero = 6255565;
		
		conta1.agencia = ag1;
		conta1.limite = 300d;
		conta1.saldo = 565.65d;
		conta1.numero = "4545454545";
				
		conta2.agencia = ag1;
		conta2.limite = 150;
		conta2.saldo = 475.65d;
		conta2.numero = "5558787";
		conta2.agencia.numero = 6255565;
		
	
		System.out.println(conta1.extrato());
		
		conta1.deposita(257.62);
		
		System.out.println();
		System.out.println("Saldo disponível: "+conta1.consultaSaldo());
		
		conta1.saque(400);
		
		System.out.println();
		System.out.println("Saldo disponível: "+conta1.consultaSaldo());
		
		//conta1.deposita(valor);
		
		//System.out.println("Agência: "+ conta1.agencia.numero+ " conta:"+ conta1.numero + " saldo: "+ conta1.saldo +" limite: "+ conta1.limite);
		//System.out.println("Agência: "+ conta2.agencia.numero+ " conta:"+ conta2.numero + " saldo: "+ conta2.saldo +" limite: "+ conta2.limite);
		
	}
}
