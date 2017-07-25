package interfaces;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorExtrato {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	static DecimalFormat df = new DecimalFormat("#0.00");
	
	public static void geraExtrato(Conta conta){
		
		Date agora = new Date();
		System.out.println("\nData:"+ sdf.format(agora));
		System.out.println("\nConta:"+ conta.getNumero() +" - Agência: "+ conta.getAgencia().getNumero());
		System.out.println("\nCliente: "+ conta.getCliente().getNome());
		System.out.println("\nSaldo: R$"+ df.format(conta.getSaldo()));
		
	}
}
