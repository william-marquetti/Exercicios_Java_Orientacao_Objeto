package orientacao_a_objetos;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.setNome("Walter");
		fun1.setSalario(1600.50d);
		
		fun2.setNome("Maria");
		fun2.setSalario(1900d);
		
		System.out.println(fun1.consultaFuncionario());
		fun1.aumentarSalario(200);
		System.out.println(fun1.consultaFuncionario());
		
		System.out.println(fun1.getNome());
		
//		System.out.println("Nome: "+ fun1.nome + " salário: "+ fun1.salario);
//		System.out.println("Nome: "+ fun2.nome + " salário: "+ fun2.salario);
	}

}
