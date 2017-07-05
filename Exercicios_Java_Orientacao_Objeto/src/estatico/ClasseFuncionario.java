package estatico;

import orientacao_a_objetos.Funcionario;

public class ClasseFuncionario {
	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
	
		
		System.out.println("Vale alimentação diário: "+ Funcionario.consultaVR());
		
		Funcionario.aumentarVR(15);
		
		System.out.println("Vale alimentação diário: "+ Funcionario.consultaVR());
		
		Funcionario.reduzirVR(15);
		
		System.out.println("Vale alimentação diário: "+ Funcionario.consultaVR());
	}

}
