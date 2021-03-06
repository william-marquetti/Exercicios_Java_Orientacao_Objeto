package classesAbstratas;

import java.text.DecimalFormat;

/**
 * 
 * @author William Gustavo Marquetti
 *
 * Classe abstrata respons�vel pela defini��o da estrutra padr�o dos objetos
 * que se estendem � conta.
 */
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
	
	/**
	 *  Construtor completo
	 *  
	 * @param numero n�mero da conta (String)
	 * @param agencia Ag�ncia da conta objeto do tipo Agencia
	 * @param cliente Cliente da conta objeto do tipo Cliente
	 * @param saldo	saldo da conta (double)
	 */
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
	
	/**
	 * M�todo padr�o para gerar extratos gen�ricos de qualquer tipo de conta,
	 * recebe um objeto do tipo conta como par�metro.
	 * 
	 * @param conta
	 */
	public abstract void gerarExtrato(Conta conta);

}
