package classesAbstratas;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Corrente contaCorrente = new Corrente(600d, 2.75, "252525225959");
		Poupanca contaPoupanca = new Poupanca(2.36d);
		
		Agencia agencia = new Agencia(232);
		Cliente cliente = new Cliente(156, "William");
		
		contaCorrente.setAgencia(agencia);
		contaCorrente.setSaldo(2600d);
		
		
	}

}
