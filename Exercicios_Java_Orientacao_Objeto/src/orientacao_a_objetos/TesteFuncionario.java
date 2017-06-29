package orientacao_a_objetos;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.nome = "Walter";
		fun1.salario = 1600.50d;
		
		fun2.nome = "Maria";
		fun2.salario = 1900d;
		
		System.out.println("Nome: "+ fun1.nome + " salário: "+ fun1.salario);
		System.out.println("Nome: "+ fun2.nome + " salário: "+ fun2.salario);
	}

}
