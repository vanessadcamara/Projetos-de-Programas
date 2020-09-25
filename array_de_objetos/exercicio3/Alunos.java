import  javax.swing.JOptionPane;
public class Aluno{
	public static void main(String[] args) {
		String nome;
		float nota = 0;
		float auxNota = 0;
		
		for(int i = 1; i <= 3; i++){
			nota = 0;
			for(int j = 0; j < 5; j++){
				String m = JOptionPane.showInputDialog("insira aqui a nota para turma "+ i);
				nota += Float.parseFloat(m);
				auxNota+= nota;
			}
			nota = nota/5;
			JOptionPane.showMessageDialog(null, "média da turma "+nota);
		}
		JOptionPane.showMessageDialog(null, "média total da escola "+auxNota/15);
	}
}
