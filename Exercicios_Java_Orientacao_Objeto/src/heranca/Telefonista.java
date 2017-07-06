package heranca;

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
	
	
	
}
