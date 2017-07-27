package classesAbstratas;

public class TesteFuncionarioGerente {

	public static void main(String[] args) {
		
		Gerente ger1 = new Gerente("joselito", "2525");
		ger1.setNome("Joselito");
		ger1.setSalario(6000d);
		System.out.println(ger1.mostraDados());
		ger1.calculaBonificacao();
		System.out.println(ger1.mostraDados());
		

		/**
		 * forma utilizada para tratar os erros que o método aumentarSalario() gerar
		 * 
		 *	 foi utilizado o "IllegalArgumentException" que não obriga o tratamendo
		 *	 da exceção, por isso é o utilizado o "catch (IllegalArgumentException e) {}",
		 *	para tratar o erro neste momento.
		 *	Se fosse utilizado uma "Exception", o tratamento seria obrigatório.
		 *
		 */
		
		try{
			ger1.aumentarSalario(0);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
	}
}
