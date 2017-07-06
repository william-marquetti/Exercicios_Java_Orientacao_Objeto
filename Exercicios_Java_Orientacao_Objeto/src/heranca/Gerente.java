package heranca;

public class Gerente extends Funcionario {
	
	private String usuario;
	private String senha;
	
	public Gerente(){
		
	}
	
	public Gerente(String usuario, String senha){
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

}
