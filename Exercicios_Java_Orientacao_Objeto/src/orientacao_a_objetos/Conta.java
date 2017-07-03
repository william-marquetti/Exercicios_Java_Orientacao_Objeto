package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Conta {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String numero;
	double saldo;
	double limite = 100d;
	Agencia agencia;
	
	public void deposita ( double valor ){
		this.saldo += valor;
	}
	
	public void saque ( double valor ){
		this.saldo -= valor;

	}
	
	public double consultaSaldo(){
		return this.saldo + this.limite;
		
	}
	
	public String extrato(){
		String extrato = "Conta: "+ this.numero +"\nAgência: "+ this.agencia.numero +"\nSaldo: R$"+ df.format(this.saldo) +" \nLimite: R$"+ df.format(this.limite);
		return extrato;
	}
	
	public Conta(String numero) {
		this.numero = numero;
	}

	public Conta(String numero, Agencia agencia) {
		this(numero);
		this.agencia = agencia;
		
	}
	
	public void transferencia(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
}

