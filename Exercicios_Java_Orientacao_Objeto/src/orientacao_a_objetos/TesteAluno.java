package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {
	public static void main(String[] args) throws ParseException {
		
		// metodo utilizado para criar datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setDataNascimento(sdf.parse("30/03/1993"));
		aluno1.setNome("William");
		aluno1.setRg("0151678");
		
		aluno2.setDataNascimento(sdf.parse("31/10/1995"));
		aluno2.setNome("Andiara");
		aluno2.setRg("1565321");
		
		
		System.out.println("Aluno 1: "+ aluno1.getNome() +" data de nascimento: "+ sdf.format(aluno1.getDataNascimento()) + " rg: "+ aluno1.getRg());
		System.out.println("Aluno 2: "+ aluno2.getNome() +" data de nascimento: "+ sdf.format(aluno2.getDataNascimento()) + " rg: "+ aluno2.getRg());
		
	}
}
