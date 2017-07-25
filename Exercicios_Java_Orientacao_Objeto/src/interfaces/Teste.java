package interfaces;

public class Teste {
	
	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia(122121);
		Cliente cliente = new Cliente(3, "William");
		
		Poupanca poupanca = new Poupanca(1.3d);
		poupanca.setSaldo(3000d);
		poupanca.setAgencia(ag1);
		poupanca.setCliente(cliente);
		
		Corrente corrente = new Corrente(100d,3.5d,"25252");
		corrente.setSaldo(2000d);
		corrente.setAgencia(ag1);
		corrente.setCliente(cliente);

		System.out.println("Conta Corrente");
		GeradorExtrato.geraExtrato(corrente);
		corrente.gerarExtratoDetalhado(corrente);

		System.out.println("\nConta Poupança");
		GeradorExtrato.geraExtrato(poupanca);
		poupanca.gerarExtratoDetalhado(poupanca);
		
		
		
	}

}
