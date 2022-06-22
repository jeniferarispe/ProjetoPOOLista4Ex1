package classeExecutavel;

import javax.swing.JOptionPane;

import model.ProfHorista;
import model.ProfRegime;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfHorista profHorista1 = new ProfHorista();
		
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		profHorista1.setNome(nome);
		String matricula = JOptionPane.showInputDialog("Digite a matricula:");
		profHorista1.setMatricula(matricula);
		String idade = JOptionPane.showInputDialog("Digite a idade:");
		profHorista1.setIdade(Integer.parseInt(idade));
		String salHora = JOptionPane.showInputDialog("Digite o Salario Por Hora:");
		profHorista1.setSalHora(Float.parseFloat(salHora));
		String totalHoras = JOptionPane.showInputDialog("Digite o total de Horas:");
		profHorista1.setTotalHoras(Integer.parseInt(totalHoras));

		System.out.println("Nome Professor Horista: " + profHorista1.getNome());
		System.out.println("Matricula Professor Horista: " + profHorista1.getMatricula());
		System.out.println("Idade Professor Horista: " + profHorista1.getIdade());
		System.out.println("Salario Professor Horista: " + profHorista1.RetornaSalario());

		ProfRegime profRegime1 = new ProfRegime();
		
		nome = JOptionPane.showInputDialog("Digite o nome:");
		profRegime1.setNome(nome);
		matricula = JOptionPane.showInputDialog("Digite a matricula:");
		profRegime1.setMatricula(matricula);
		idade = JOptionPane.showInputDialog("Digite a idade:");
		profRegime1.setIdade(Integer.parseInt(idade));
		String salario = JOptionPane.showInputDialog("Digite o Salario Bruto:");
		profRegime1.setSalario(Float.parseFloat(salario));
	
		System.out.println("--------------------------------------- " );
		System.out.println("Nome Professor Regime: " + profRegime1.getNome());
		System.out.println("Matricula Professor Regime: " + profRegime1.getMatricula());
		System.out.println("Idade Professor Regime: " + profRegime1.getIdade());
		System.out.println("Salario Professor Regime: " + profRegime1.RetornaSalario());

	}

}
