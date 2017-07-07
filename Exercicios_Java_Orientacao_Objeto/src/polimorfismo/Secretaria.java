package polimorfismo;

public class Secretaria extends Funcionario {
	
	private String ramal;
	
	public Secretaria(){
		
	}
	
	public Secretaria(String ramal){
		this.ramal = ramal;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	@Override
	public String mostraDados() {
		String dados = super.mostraDados();
		dados += "\nRamal: "+ this.getRamal()+"\n";
		return  dados;
	}
	
	
}
