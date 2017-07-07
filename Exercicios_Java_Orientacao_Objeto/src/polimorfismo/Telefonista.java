package polimorfismo;

public class Telefonista extends Funcionario {
	
	private int codigoEstacaoTrabalho;
	
	public Telefonista(){
		
	}
	
	public Telefonista(int codigoEstacaoTrabalho){
		this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;
	}

	public int getCodigoEstacaoTrabalho() {
		return codigoEstacaoTrabalho;
	}

	public void setCodigoEstacaoTrabalho(int codigoEstacaoTrabalho) {
		this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;
	}
	
	@Override
	public String mostraDados() {
		String dados = super.mostraDados();
		dados += "\nEstação de Trabalho:"+ getCodigoEstacaoTrabalho()+"\n";
		return dados;
	}
	
}
