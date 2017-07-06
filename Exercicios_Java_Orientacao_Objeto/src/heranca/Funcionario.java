package heranca;

public class Funcionario {
	
	private String nome;
	private double salario;

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

}
