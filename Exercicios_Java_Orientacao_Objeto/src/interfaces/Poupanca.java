package interfaces;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Poupanca extends Conta {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	DecimalFormat df = new DecimalFormat("#0.00");
		
	private double taxaRendimento;

	public Poupanca(){
		
	}
	
	public Poupanca(double taxaRendimento) {
		super();
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void gerarExtratoDetalhado(Conta conta) {
		
		Date agora = new Date();
		System.out.println("\nData:"+ sdf.format(agora));
		System.out.println("\nConta:"+ conta.getNumero() +" - Agência: "+ conta.getAgencia().getNumero());
		System.out.println("\nCliente: "+ conta.getCliente().getNome());
		System.out.println("\nSaldo: R$"+ df.format(conta.getSaldo()));
		System.out.println("\nTaxa de juros (rendimento): R$"+ df.format(this.taxaRendimento));
				
	}	
	
}
