package classesAbstratas;

public class Gerente extends Funcionario {
	
	private String usuario;
	private String senha;
	
	public Gerente(){
		
	}
	
	public Gerente(String usuario, String senha){
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
		
	@Override
	public String mostraDados() {
		String dados = super.mostraDados();
		dados += "\nUsuário: "+ this.getUsuario();
		dados += "\nSenha: "+ this.getSenha()+"\n";
		return dados;
	}

	@Override
	public void calculaBonificacao() {
		setBonificacao(getSalario()*0.10);

	}

}
