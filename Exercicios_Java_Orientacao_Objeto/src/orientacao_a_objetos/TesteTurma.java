package orientacao_a_objetos;

public class TesteTurma {
	public static void main(String[] args) {
		
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		
		t1.setPeriodo('m');
		t1.setSerie(8); 
		t1.setSigla("8-B"); 
		t1.setTipoEnsino("Fundamental");
		
		t2.setPeriodo('v');
		t2.setSerie(3); 
		t2.setSigla("3-C");
		t2.setTipoEnsino("M�dio");
		
		System.out.println("Sigla: "+ t1.getSigla() +" s�rie: "+ t1.getSerie()+ "ensino: "+ t1.getTipoEnsino() + "per�odo: "+ t1.getPeriodo() );
		System.out.println("Sigla: "+ t2.getSigla() +" s�rie: "+ t2.getSerie()+ "ensino: "+ t2.getTipoEnsino() + "per�odo: "+ t2.getPeriodo() );
		
		
	}
}
