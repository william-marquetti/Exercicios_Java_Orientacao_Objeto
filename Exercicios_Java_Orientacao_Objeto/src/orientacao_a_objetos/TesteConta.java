package orientacao_a_objetos;

public class TesteConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.numero = 1;
		conta1.saldo = 1300.64d;
		conta1.limite = 1500.50d;
		
		conta2.numero = 2;
		conta2.saldo = 950.32d;
		conta2.limite = 1050.00d;
		
		System.out.println("Conta: "+ conta1.numero + " saldo: "+ conta1.saldo +" limite: "+ conta1.limite);
		System.out.println("Conta: "+ conta2.numero + " saldo: "+ conta2.saldo +" limite: "+ conta2.limite);
	}
}
