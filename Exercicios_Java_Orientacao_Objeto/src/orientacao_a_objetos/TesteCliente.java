package orientacao_a_objetos;

public class TesteCliente {
	public static void main(String[] args) {
		
		// criando o objeto cliente
		
		Cliente cliente1 = new Cliente(); 
		Cliente cliente2 = new Cliente(); 
		
		// atribuindo valores 
		cliente1.nome = "William";
		cliente1.codigo = 1;
		
		cliente2.nome = "Andiara";
		cliente2.codigo = 2;
		
		System.out.println("Cliente 1: "+ cliente1.nome + " C�digo: " + cliente1.codigo);
		
		System.out.println("Cliente 2: "+ cliente2.nome + " C�digo: " + cliente2.codigo);
		
	}
}
