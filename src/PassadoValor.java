import javax.swing.JOptionPane;

public class PassadoValor {
	
	public String pasandoValores(){
		
		String idade = JOptionPane.showInputDialog("Sua idade: ");
		String valorEmprestimo = JOptionPane.showInputDialog("O valor do emprestimo: ");
		String mesesPagar = JOptionPane.showInputDialog("Quantos meses para pagamento? ");
	
		return idade;
	
	}

}
