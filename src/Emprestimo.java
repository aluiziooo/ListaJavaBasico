import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class Emprestimo {
	
	private String nomeUsuario; 
	private int idade;
	private float valorEmprestimo;
	private float percentualJurosMes; 
	private int mesesParaPagar;
	 
	public float fazerEmprestimo(int age, float vE,float pJM, int mPP){
		if(age >= 18 && age < 23){
			vE += (vE/mPP)*pJM;
		}
		if(age > 23 && age <= 33){
			vE += (vE*10)/100;
		}
		return vE;
	}
	
	public int menu(){
		String Menu = "Olar senhor(a) "+this.nomeUsuario+" voce tem essas opções abaixo\n";
		Menu += "1 - Realizar emprestimo\n" ;
		Menu += "2 - Ver emprestimo \n";
		Menu += "3 - Sair";
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(Menu));
		
		return opcao;
	}
	public void imprimir(){
		String Msg = "O Nome do usuario: "+this.getNomeUsuario()+"\n";
		Msg += "Idade: : "+this.getIdade()+"\n";
		Msg += "Valor do emprestimo: : "+this.getValorEmprestimo()+"\n";
		Msg += "Percentual de juros por mes : "+this.getPercentualJurosMes()+"\n";
		Msg += "Meses para pagar: "+this.getMesesParaPagar()+"\n";
		
		JOptionPane.showMessageDialog(null, Msg);
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getPercentualJurosMes() {
		return percentualJurosMes;
	}
	public void setPercentualJurosMes(float percentualJurosMes) {
		this.percentualJurosMes = percentualJurosMes;
	}
	public int getMesesParaPagar() {
		return mesesParaPagar;
	}
	public void setMesesParaPagar(int mesesParaPagar) {
		this.mesesParaPagar = mesesParaPagar;
	}
	public float getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

}
