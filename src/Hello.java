import javax.swing.JOptionPane;


public class Hello {

	/**
	 *  Initial test to lear use of git.
	 * @param args
	 */
	public static void main(String[] args) {
		String nome;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo! " + nome);
		
	}

}
