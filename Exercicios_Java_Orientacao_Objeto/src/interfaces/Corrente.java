package interfaces;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Corrente extends Conta {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
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

	@Override
	public void gerarExtratoDetalhado(Conta conta) {
		
		Date agora = new Date();
		System.out.println("\nData:"+ sdf.format(agora));
		System.out.println("\nConta:"+ conta.getNumero() +" - Agência: "+ conta.getAgencia().getNumero());
		System.out.println("\nCliente: "+ conta.getCliente().getNome());
		System.out.println("\nSaldo: R$"+ df.format(conta.getSaldo()));
		System.out.println("\nLimite: R$"+ df.format(this.limite));
		System.out.println("\nTaxa de juros: R$"+ df.format(this.taxaJuros));
		System.out.println("\nSaldo Disponível: R$"+ df.format(this.limite)+df.format(conta.getSaldo()));
		
	}



}
