package polimorfismo;

import java.text.DecimalFormat;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Gerente gerente = new Gerente();
		gerente.setNome("Jos�");
		gerente.setSalario(4900d);
		gerente.setUsuario("jose");
		gerente.setSenha("pudim");
				
		Telefonista telefonista = new Telefonista(57);
		telefonista.setNome("Maria");
		telefonista.setSalario(1500d);
		
		Secretaria secretaria = new Secretaria("66");
		secretaria.setNome("Cl�udia");
		secretaria.setSalario(1550d);
		
		telefonista.aumentarSalario(10);
		secretaria.aumentarSalario(10);
		gerente.aumentarSalario(10);
		
		System.out.println(secretaria.getNome()+ " sal�rio anterior: R$"+df.format(secretaria.getSalario()));
		System.out.println(gerente.getNome()+ " sal�rio anterior: R$"+df.format(telefonista.getSalario()));
		System.out.println(gerente.getNome()+ " sal�rio anterior: R$"+df.format(gerente.getSalario())+"\n");
		
		System.out.println(secretaria.getNome()+ " sal�rio: R$"+df.format(secretaria.getSalario()));
		System.out.println(telefonista.getNome()+ " sal�rio: R$"+df.format(telefonista.getSalario()));
		System.out.println(gerente.getNome()+ " sal�rio: R$"+df.format(gerente.getSalario())+"\n");
		
		gerente.calculaBonificacao();
		secretaria.calculaBonificacao();
		telefonista.calculaBonificacao();
		
		System.out.println(gerente.mostraDados());
		System.out.println(secretaria.mostraDados());
		System.out.println(telefonista.mostraDados());
		
	}
}
