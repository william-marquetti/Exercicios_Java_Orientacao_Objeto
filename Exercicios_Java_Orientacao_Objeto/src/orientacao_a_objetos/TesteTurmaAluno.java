package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteTurmaAluno {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		Turma turma1 = new Turma();
				
		aluno1.setDataNascimento(sdf.parse("30/03/1993"));
		aluno1.setNome("William");
		aluno1.setRg("61414145");
		
		turma1.setPeriodo('m');
		turma1.setSerie(8);
		turma1.setSigla("8-B");
		turma1.setTipoEnsino("Fundamental");
		
		aluno1.setTurma(turma1);
		
		System.out.println("Aluno: "+ aluno1.getNome() + " data de nascimento: "+ sdf.format(aluno1.getDataNascimento()) + " rg: "+ aluno1.getRg() +" série: "+ aluno1.getTurma().getSerie() +" período: "+ aluno1.getTurma().getPeriodo() +" sigla: "+ aluno1.getTurma().getSigla() +" tipo de ensino: "+ aluno1.getTurma().getTipoEnsino());
		
	}
}
