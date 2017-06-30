package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartao {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		CartaoDeCredito cdc = new CartaoDeCredito();
		Cliente cliente1 = new Cliente();
		
		cdc.numero = "5715172568441";
		cdc.dataValidade = sdf.parse("05/07/2018");
		
		cliente1.nome = "William";
		cliente1.codigo = 3;
		
		cdc.cliente = cliente1;

		CartaoDeCredito cdc2 = new CartaoDeCredito();
		
		Cliente cliente2 = new Cliente();
		
		cdc2.cliente = cliente2;
		
		cdc2.cliente.nome = "Andiara";
		cdc2.cliente.codigo = 4;
		cdc2.numero = "15151515115";
		cdc2.dataValidade = sdf.parse("05/12/2018");
		
		System.out.println("Cliente: "+ cdc.cliente.nome + " número do cartão: "+  cdc.numero + " data de validade: "+ sdf.format(cdc.dataValidade));
		System.out.println("Cliente: "+ cdc2.cliente.nome + " número do cartão: "+  cdc2.numero + " data de validade: "+ sdf.format(cdc2.dataValidade));
		
	}

}
