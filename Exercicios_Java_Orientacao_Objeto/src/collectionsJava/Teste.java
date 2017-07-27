package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Corrente> contaCorrente = new ArrayList<Corrente>();
		List<Poupanca> contaPoupanca = new ArrayList<Poupanca>();
		
		Agencia ag1 = new Agencia(122121);
		Cliente cliente = new Cliente(3, "William");
		
		Poupanca poupanca = new Poupanca(1.3d);
		poupanca.setSaldo(3000d);
		poupanca.setAgencia(ag1);
		poupanca.setCliente(cliente);
		
		Poupanca poupanca2 = new Poupanca(1.5d);
		poupanca.setSaldo(900d);
		poupanca.setAgencia(ag1);
		poupanca.setCliente(cliente);
		
		Poupanca poupanca3 = new Poupanca(1.4d);
		poupanca.setSaldo(2000d);
		poupanca.setAgencia(ag1);
		poupanca.setCliente(cliente);
		
		Corrente corrente = new Corrente(100d,3.5d,"25252");
		corrente.setSaldo(2000d);
		corrente.setAgencia(ag1);
		corrente.setCliente(cliente);
		
		Corrente corrente2 = new Corrente(200d,3.5d,"555");
		corrente.setSaldo(2500d);
		corrente.setAgencia(ag1);
		corrente.setCliente(cliente);
		
		Corrente corrente3 = new Corrente(100d,3.5d,"585858");
		corrente.setSaldo(1500d);
		corrente.setAgencia(ag1);
		corrente.setCliente(cliente);

		contaCorrente.add(corrente);
		contaCorrente.add(corrente2);
		contaCorrente.add(corrente3);
		
		contaPoupanca.add(poupanca);
		contaPoupanca.add(poupanca2);
		contaPoupanca.add(poupanca3);
		
		for (Poupanca object : contaPoupanca) {
			System.out.println(object.getCliente().getNome());
		}
		
	}

}
