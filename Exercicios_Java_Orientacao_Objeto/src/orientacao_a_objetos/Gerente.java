package orientacao_a_objetos;

public class Gerente {
	
	double salario;
	String nome;
	
	public void aumentaSalario(){
		this.aumentaSalario(10);
	}
	
	public void aumentaSalario(double valor){
		this.salario = this.salario*((valor/100)+1);
	}
	

}
