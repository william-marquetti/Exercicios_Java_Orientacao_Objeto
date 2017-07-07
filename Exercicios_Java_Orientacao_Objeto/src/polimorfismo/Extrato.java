package polimorfismo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Extrato {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	public void extrato(Conta conta){
		
		Date agora = new Date();
		System.out.println("\nData:"+ sdf.format(agora));
		System.out.println("\nConta:"+ conta.getNumero() +" - Agência: "+ conta.getAgencia().getNumero());
		System.out.println("\nCliente: "+ conta.getCliente().getNome());
		System.out.println("\nSaldo: R$"+ df.format(conta.getSaldo()));
		
	}
	
}
