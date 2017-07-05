package orientacao_a_objetos;

public class Gerente {
	
	private double salario;
	private String nome;
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void aumentaSalario(){
		this.aumentaSalario(10);
	}
	
	public void aumentaSalario(double valor){
		this.salario = this.salario*((valor/100)+1);
	}
	

}
