package polimorfismo;

public class TesteControlePonto {
	
	public static void main(String[] args) {
		
		ControlePonto controlePonto = new ControlePonto();
		
		Gerente gerente = new Gerente("gerente.usuario", "unicornio");
		Telefonista telefonista = new Telefonista(12);
		
		gerente.setNome("William");
		gerente.setSalario(5600d);
		gerente.setBonificacao(360d);
		
		telefonista.setNome("Andiara");
		telefonista.setSalario(1900d);
		telefonista.setBonificacao(100d);
		
		controlePonto.registraEntrada(gerente);
		controlePonto.registraSaida(gerente);
		controlePonto.registraEntrada(telefonista);
		controlePonto.registraSaida(telefonista);
			
		
	}
		

}
