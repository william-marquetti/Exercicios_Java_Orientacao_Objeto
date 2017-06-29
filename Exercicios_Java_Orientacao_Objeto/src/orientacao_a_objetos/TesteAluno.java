package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {
	public static void main(String[] args) throws ParseException {
		
		// metodo utilizado para criar datas
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.dataNascimento = sdf.parse("30/03/1993");
		aluno1.nome = "William";
		aluno1.rg = "0151678";
		
		aluno2.dataNascimento = sdf.parse("31/10/1995");
		aluno2.nome = "Andiara";
		aluno2.rg = "1565321";
		
		
		System.out.println("Aluno 1: "+ aluno1.nome +" data de nascimento: "+ sdf.format(aluno1.dataNascimento) + " rg: "+ aluno1.rg);
		System.out.println("Aluno 2: "+ aluno2.nome +" data de nascimento: "+ sdf.format(aluno2.dataNascimento) + " rg: "+ aluno2.rg);
		
	}
}
