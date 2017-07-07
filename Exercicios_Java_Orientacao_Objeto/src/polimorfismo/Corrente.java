package polimorfismo;

import java.text.DecimalFormat;

public class Corrente extends Conta {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double limite;
	private double taxaJuros;

	public Corrente(){
		
	}
	
	public Corrente(double limite, double taxaJuros, String numero) {
		super.setNumero(numero);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

}
