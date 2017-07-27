package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		/**
		 * Utilização do conceito Generics, representada pelo tipo da lista entre "<>"
		 * conforme exemplo abaixo, a lista possui objetos do tipo Corrente.
		 * 
		 *  List<Corrente> contaCorrente = new ArrayList<Corrente>() 
		 *  
		 */
		List<Corrente> contaCorrente = new ArrayList<Corrente>();
		List<Poupanca> contaPoupanca = new ArrayList<Poupanca>();
		
		Agencia ag1 = new Agencia(122121);
		Cliente cliente = new Cliente(3, "William");
		
		Poupanca poupanca = new Poupanca(1.3d, "995959");
		poupanca.setSaldo(3000d);
		poupanca.setAgencia(ag1);
		poupanca.setCliente(cliente);
		
		Poupanca poupanca2 = new Poupanca(1.5d, "85858");
		poupanca2.setSaldo(900d);
		poupanca2.setAgencia(ag1);
		poupanca2.setCliente(cliente);
		
		Poupanca poupanca3 = new Poupanca(1.4d, "58577747");
		poupanca3.setSaldo(2000d);
		poupanca3.setAgencia(ag1);
		poupanca3.setCliente(cliente);
		
		Corrente corrente = new Corrente(100d,3.5d,"25252");
		corrente.setSaldo(2000d);
		corrente.setAgencia(ag1);
		corrente.setCliente(cliente);
		
		Corrente corrente2 = new Corrente(200d,3.5d,"555");
		corrente2.setSaldo(2500d);
		corrente2.setAgencia(ag1);
		corrente2.setCliente(cliente);
		
		Corrente corrente3 = new Corrente(100d,3.5d,"585858");
		corrente3.setSaldo(1500d);
		corrente3.setAgencia(ag1);
		corrente3.setCliente(cliente);

		contaCorrente.add(corrente);
		contaCorrente.add(corrente2);
		contaCorrente.add(corrente3);
		
		contaPoupanca.add(poupanca);
		contaPoupanca.add(poupanca2);
		contaPoupanca.add(poupanca3);
		
		for (Poupanca object : contaPoupanca) {
			System.out.println(object.getSaldo());
		}

		System.out.println("Tamanho da lista de Contas Correntes:");
		System.out.println(contaCorrente.size());

		System.out.println("Tamanho da lista de Contas Poupança:");
		System.out.println(contaPoupanca.size());
		
		contaCorrente.remove(corrente);
		contaCorrente.remove(1);
		
		contaPoupanca.remove(poupanca);
		contaPoupanca.remove(1);
		
		for (Poupanca poupanca4 : contaPoupanca) {
			poupanca4.gerarExtratoDetalhado(poupanca4);
		}
		
		for (Corrente corrente4 : contaCorrente) {
			corrente4.gerarExtratoDetalhado(corrente4);
		}
		
		contaCorrente.clear();
		contaPoupanca.clear();

		System.out.println("\nTamanho da lista de Contas Correntes:");
		System.out.println(contaCorrente.size());

		System.out.println("Tamanho da lista de Contas Poupança:");
		System.out.println(contaPoupanca.size());
	}

}
