package classesAbstratas;

public class TesteFuncionarioGerente {

	public static void main(String[] args) {
		
		Gerente ger1 = new Gerente("joselito", "2525");
		ger1.setNome("Joselito");
		ger1.setSalario(6000d);
		System.out.println(ger1.mostraDados());
		ger1.calculaBonificacao();
		System.out.println(ger1.mostraDados());
	}
}
