package orientacao_a_objetos;

import javax.swing.JOptionPane;

public class TesteFuncionario2 {

	public static void main(String[] args) {
					

		
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = JOptionPane.showInputDialog("Informe o nome do funcionário."); 
		funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionário."));
		
		int continuar = JOptionPane.showConfirmDialog(null, "Deseja alterar os dados novamente?");
		int imprimirDados = JOptionPane.showConfirmDialog(null, "Deseja consultar os dados do funcionario?");
		
		if (imprimirDados == 0){
			JOptionPane.showMessageDialog(null, funcionario.consultaFuncionario());
		}
		
		while (continuar == 0){
			funcionario.nome = JOptionPane.showInputDialog("Informe o nome do funcionário."); 
			funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do funcionário."));
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja alterar os dados novamente?");
			
			imprimirDados = JOptionPane.showConfirmDialog(null, "Deseja consultar os dados do funcionario?");
			
			if (imprimirDados == 0){
				JOptionPane.showMessageDialog(null, funcionario.consultaFuncionario());
			}
			
		}

	}

}
