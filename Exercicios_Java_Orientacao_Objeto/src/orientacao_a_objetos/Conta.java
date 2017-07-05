package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Conta {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String numero;
	private double saldo;
	private double limite = 100d;
	private Agencia agencia;
	public static int contasCriadas;
	private int idConta;
	
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

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
		String extrato = "Conta: "+ this.numero +"\nAg�ncia: "+ this.agencia.getNumero() +"\nSaldo: R$"+ df.format(this.saldo) +" \nLimite: R$"+ df.format(this.limite);
		return extrato;
	}
	
	public Conta(String numero) {
		this.numero = numero;
		this.contagemContas();
	}

	public Conta(String numero, Agencia agencia) {
		this(numero);
		this.agencia = agencia;
		this.contagemContas();
	}
	
	public void transferencia(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	// incrementa a quantidade de contas criadas a cada instancia de objeto
	public void contagemContas(){
		this.contasCriadas += 1;
		this.idConta = contasCriadas;
	}
	
	// retorna a quantidade total de contas criadas pela classe 
	public static int totalContas(){
		return contasCriadas;
	}
	
	// retorna o id da conta
	public int consultaId(){
		return this.idConta;
	}
	
	// retorna o id da conta em mensgem no console 
	public String consultaIdConsole(){
		String id = "ID: "+this.idConta;
		return id;
	}
	
	public static void zeraContador(){
		System.out.println(Conta.contasCriadas);
		Conta.contasCriadas = 0;
	}
	
}

