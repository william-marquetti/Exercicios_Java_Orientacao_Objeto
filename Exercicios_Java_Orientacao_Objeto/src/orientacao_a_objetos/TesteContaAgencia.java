package orientacao_a_objetos;

public class TesteContaAgencia {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Agencia ag1 = new Agencia();
		
		conta1.agencia = ag1;
		conta1.limite = 300d;
		conta1.saldo = 565.65d;
		conta1.numero = "4545454545";
		conta1.agencia.numero = 6255565;
		
		System.out.println("Agência: "+ conta1.agencia.numero+ " conta:"+ conta1.numero + " saldo: "+ conta1.saldo +" limite: "+ conta1.limite);
		
	}
}
