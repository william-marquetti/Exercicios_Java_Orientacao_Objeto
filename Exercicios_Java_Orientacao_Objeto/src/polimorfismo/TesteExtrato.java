package polimorfismo;

public class TesteExtrato {

	public static void main(String[] args) {
		
		Extrato imprimirExtrato = new Extrato();
		
		Corrente contaCorrente = new Corrente(350d, 3.99d, "2665656");
		Cliente cliente1 = new Cliente(1, "Andiara");		
		Agencia agencia1 = new Agencia(1);
		
		contaCorrente.setAgencia(agencia1);
		contaCorrente.setCliente(cliente1);
		contaCorrente.setSaldo(1659.65d);
				
		imprimirExtrato.extrato(contaCorrente);
		
	}
}
