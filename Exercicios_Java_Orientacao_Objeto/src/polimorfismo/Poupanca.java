package polimorfismo;

import java.text.DecimalFormat;

public class Poupanca extends Conta {
	
	DecimalFormat df = new DecimalFormat("#0.00");
		
	private double taxaRendimento;

	public Poupanca(){
		
	}
	
	public Poupanca(DecimalFormat df, double taxaRendimento) {
		super();
		this.df = df;
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	
}
