package orientacao_a_objetos;

public class TesteTurma {
	public static void main(String[] args) {
		
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		
		t1.periodo = 'm';
		t1.serie = 8;
		t1.sigla = "8-B";
		t1.tipoEnsino = "Fundamental";
		
		t2.periodo = 'v';
		t2.serie = 3;
		t2.sigla = "3-C";
		t2.tipoEnsino = "M�dio";
		
		System.out.println("Sigla: "+ t1.sigla +" s�rie: "+ t1.serie+ "ensino: "+ t1.tipoEnsino + "per�odo: "+ t1.periodo );
		System.out.println("Sigla: "+ t2.sigla +" s�rie: "+ t2.serie+ "ensino: "+ t2.tipoEnsino + "per�odo: "+ t2.periodo );
		
		
	}
}
