package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteGerente {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		Gerente gerente = new Gerente();
		Gerente gerente2 = new Gerente();
		
		gerente.setNome("William");
		gerente.setSalario(2500d);
				
		gerente.aumentaSalario();
		
		gerente2.setNome("Andiara");
		gerente2.setSalario(2500d);
				
		gerente2.aumentaSalario(25);
		
		System.out.println("Gerente:" + gerente.getNome() + " salário com aumento: R$"+ df.format(gerente.getSalario()));
		System.out.println("Gerente:" + gerente2.getNome() + " salário com aumento: R$"+ df.format(gerente2.getSalario()));
	}

}
