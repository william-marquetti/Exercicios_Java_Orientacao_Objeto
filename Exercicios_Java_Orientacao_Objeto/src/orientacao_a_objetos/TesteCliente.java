package orientacao_a_objetos;

public class TesteCliente {
	public static void main(String[] args) {
		
		// criando o objeto cliente
		
		Cliente cliente1 = new Cliente(); 
		Cliente cliente2 = new Cliente(); 
		
		// atribuindo valores 
		cliente1.setNome("William");
		cliente1.setCodigo(1);
		
		cliente2.setNome("Andiara");
		cliente2.setCodigo(2);
		
		System.out.println("Cliente 1: "+ cliente1.getNome() + " Código: " + cliente1.getCodigo());
		
		System.out.println("Cliente 2: "+ cliente2.getNome() + " Código: " + cliente2.getCodigo());
		
	}
}
