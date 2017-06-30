package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteTurmaAluno {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		Turma turma1 = new Turma();
				
		aluno1.dataNascimento = sdf.parse("30/03/1993");
		aluno1.nome = "William";
		aluno1.rg = "61414145";
		
		turma1.periodo = 'm';
		turma1.serie = 8;
		turma1.sigla = "8-B";
		turma1.tipoEnsino = "Fundamental";
		
		aluno1.turma = turma1;
		
		System.out.println("Aluno: "+ aluno1.nome + " data de nascimento: "+ sdf.format(aluno1.dataNascimento) + " rg: "+ aluno1.rg +" série: "+ aluno1.turma.serie +" período: "+ aluno1.turma.periodo +" sigla: "+ aluno1.turma.sigla +" tipo de ensino: "+ aluno1.turma.tipoEnsino);
		
	}
}
