package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String nome;
	double salario = 1000d;
	
	void aumentarSalario(double valor){
		this.salario += valor;
	}
	
	public String consultaFuncionario(){
		String funcionario = "Nome: "+ this.nome +" sal�rio: R$ "+ df.format(this.salario);
		return funcionario;
	}
	
}
