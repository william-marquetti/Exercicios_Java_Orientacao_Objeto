package classesAbstratas;

import java.text.DecimalFormat;

public abstract class Conta {

	DecimalFormat df = new DecimalFormat("#0.00");

	private String numero;
	private Agencia agencia;
	private Cliente cliente;
	private double saldo;

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(){
		
	}
	
	public Conta(String numero, Agencia agencia, Cliente cliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public DecimalFormat getDf() {
		return df;
	}

	public void setDf(DecimalFormat df) {
		this.df = df;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public abstract void gerarExtrato(Conta conta);

}
