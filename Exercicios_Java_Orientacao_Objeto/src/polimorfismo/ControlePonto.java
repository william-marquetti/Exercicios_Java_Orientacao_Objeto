package polimorfismo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ControlePonto {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void registraEntrada(Funcionario funcionario){
		
		Date agora = new Date();
		System.out.println("\nEntrada: "+funcionario.getNome());
		System.out.println("Data: "+ sdf.format(agora));
	}
	
	public void registraSaida(Funcionario funcionario){
		
		Date agora = new Date();
		System.out.println("\nSaída: "+funcionario.getNome());
		System.out.println("Data: "+ sdf.format(agora));
	}

}
