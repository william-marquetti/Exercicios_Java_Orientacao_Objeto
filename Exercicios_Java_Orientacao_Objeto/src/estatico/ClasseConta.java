package estatico;

import orientacao_a_objetos.Conta;

public class ClasseConta {
	public static void main(String[] args) {
		System.out.println(Conta.totalContas());
		
		Conta conta1 = new Conta("05252525");
		Conta conta2 = new Conta("26262626");
		
		System.out.println("Conta1 id: " + conta1.consultaId());
		System.out.println("Conta2 id: " + conta2.consultaId());
		System.out.println(Conta.totalContas());
		System.out.println(conta1.consultaIdConsole());
		Conta.zeraContador();
		System.out.println(Conta.totalContas());

	}

}
