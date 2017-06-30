package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {
	String nome;
	double salario;
	
	void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public String consultaFuncionario(){
		DecimalFormat df = new DecimalFormat("#0.00");
		String funcionario = "Nome: "+ this.nome +" salário: R$ "+ df.format(this.salario);
		return funcionario;
	}
	
}
