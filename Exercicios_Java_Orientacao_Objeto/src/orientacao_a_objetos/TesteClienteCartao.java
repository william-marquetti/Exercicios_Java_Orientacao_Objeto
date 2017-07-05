package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartao {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		CartaoDeCredito cdc = new CartaoDeCredito("5715172568441");
		Cliente cliente1 = new Cliente();
		
		cdc.setDataValidade(sdf.parse("05/07/2018"));
		
		cliente1.setNome("William");
		cliente1.setCodigo(3);
		
		cdc.setCliente(cliente1); 

		CartaoDeCredito cdc2 = new CartaoDeCredito("15151515115");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Andiara");
		cliente2.setCodigo(4);
		cdc2.setCliente(cliente2);
	
		cdc2.setDataValidade(sdf.parse("05/12/2018")); 
				
		System.out.println("Cliente: "+ cdc.getCliente().getNome() + " número do cartão: "+  cdc.getNumero() + " data de validade: "+ sdf.format(cdc.getDataValidade()));
		System.out.println("Cliente: "+ cdc2.getCliente().getNome() + " número do cartão: "+  cdc2.getNumero() + " data de validade: "+ sdf.format(cdc2.getDataValidade()));
		
	}

}
