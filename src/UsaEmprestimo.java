import javax.swing.JOptionPane;

public class UsaEmprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emprestimo Emp1 = new Emprestimo();
		PassadoValor PV = new PassadoValor();
		float percentualJurosMes = 1.5f;
		
		String nome = JOptionPane.showInputDialog("Qual o nome do usuario?");
		Emp1.setNomeUsuario(nome);
		nome = Emp1.getNomeUsuario();
		
		while(true){
			int Opcao =  Emp1.menu();
			
			switch (Opcao) {
			case 1:
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade: "));
				float vE = Float.parseFloat(JOptionPane.showInputDialog("O valor do emprestimo: "));
				int mesesParaPagar = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses para pagamento? "));
				Emp1.setIdade(idade);
				Emp1.setMesesParaPagar(mesesParaPagar);
				Emp1.setPercentualJurosMes(percentualJurosMes);
				vE = Emp1.fazerEmprestimo(idade, vE,percentualJurosMes, mesesParaPagar);
				float setvE = vE;
				Emp1.setValorEmprestimo(setvE);
				JOptionPane.showMessageDialog(null, "Emprestimo feito com sucesso");
				break;
			case 2:
				Emp1.imprimir();
				break;
			
			case 3:
				System.exit(1);
				break;

			default:
				JOptionPane.showMessageDialog(null, "ESCOLHA INVALIDA, TENTE DE NOVO.");
				break;
			}
		}

	}

}
