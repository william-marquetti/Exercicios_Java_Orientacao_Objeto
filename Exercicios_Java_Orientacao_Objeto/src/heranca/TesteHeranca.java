package heranca;

import java.text.DecimalFormat;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Gerente gerente = new Gerente();
		gerente.setNome("José");
		gerente.setSalario(4900d);
		gerente.setUsuario("jose");
		gerente.setSenha("pudim");
		gerente.aumentarSalario(10);
		
		Telefonista telefonista = new Telefonista(57);
		telefonista.setNome("Maria");
		telefonista.setSalario(1500d);
		telefonista.aumentarSalario(10);
		
		Secretaria secretaria = new Secretaria("66");
		secretaria.setNome("Cláudia");
		secretaria.setSalario(1550d);
		secretaria.aumentarSalario(10);
		
		
	}
}
