package classesAbstratas;

import java.text.DecimalFormat;

public abstract class Funcionario {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String nome;
	private double salario;
	private double bonificacao;

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	// construtor padrao
	public Funcionario(){
		
	}
	
	// construtor completo
	public Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double taxa){
		
		if ( taxa <= 0 ){
			//IllegalArgumentException erro = new IllegalArgumentException("O valor digitado para taxa é inferior ou igual a 0");
			
			IllegalArgumentException erro = new IllegalArgumentException("Taxa incorreta! \n Código de erro: 0xf0102");
			throw erro;
		} else {
			this.salario = salario*((taxa/100)+1);
		}
		
				
	}
	
	public abstract void calculaBonificacao();
	
//	public void calculaBonificacao(){
//		this.bonificacao = salario*0.05;
//	}
	
	public String mostraDados(){
		String dados;
		dados = "\nNome: "+ this.getNome();
		dados += "\nSalário: R$"+ df.format(this.getSalario());
		dados +="\nBonificação: "+ df.format(this.getBonificacao());
		
		return dados;
	}

}
