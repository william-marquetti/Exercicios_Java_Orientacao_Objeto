package heranca;

import java.text.DecimalFormat;

public class Funcionario {
	
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
		this.salario = salario*((taxa/100)+1);
		
	}
	
	public void calculaBonificacao(){
		this.bonificacao = salario*0.05;
	}
	
	public String mostraDados(){
		String dados;
		dados = "\nNome: "+ this.getNome();
		dados += "\nSal�rio: R$"+ df.format(this.getSalario());
		dados +="\nBonifica��o: "+ df.format(this.getBonificacao());
		
		return dados;
	}

}
