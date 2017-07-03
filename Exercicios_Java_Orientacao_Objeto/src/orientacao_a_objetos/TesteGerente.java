package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteGerente {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		Gerente gerente = new Gerente();
		Gerente gerente2 = new Gerente();
		
		gerente.nome = "William";
		gerente.salario = 2500d;
				
		gerente.aumentaSalario();
		
		gerente2.nome = "Andiara";
		gerente2.salario = 2500d;
				
		gerente2.aumentaSalario(25);
		
		System.out.println("Gerente:" + gerente.nome + " salário com aumento: R$"+ df.format(gerente.salario));
		System.out.println("Gerente:" + gerente2.nome + " salário com aumento: R$"+ df.format(gerente2.salario));
	}

}
