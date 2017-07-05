package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String nome;
	private double salario = 1000d;
	public static double valeRefeicao = 15d;
		
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

	public static double getValeRefeicao() {
		return valeRefeicao;
	}

	public static void setValeRefeicao(double valeRefeicao) {
		Funcionario.valeRefeicao = valeRefeicao;
	}

	void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public String consultaFuncionario(){
		String funcionario = "Nome: "+ this.nome +" salário: R$ "+ df.format(this.salario);
		return funcionario;
	}
	
	public static double consultaVR(){
		return Funcionario.valeRefeicao;
	}
	
	public static void aumentarVR(double taxa){
		Funcionario.valeRefeicao = Funcionario.valeRefeicao*((taxa/100)+1);
		
	}
	
	public static void reduzirVR(double taxa){
		Funcionario.valeRefeicao = Funcionario.valeRefeicao*((100-taxa)/100);
		
	}
	
}
