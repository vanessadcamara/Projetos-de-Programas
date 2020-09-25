import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("qte de professores ");
		int i = Integer.parseInt(s);
		ArrayList<Professor> professor = new ArrayList<Professor>();
		for(int k = 0; k < i; k++) {
			String auxProf = JOptionPane.showInputDialog("nome do prof ");
			Professor prof = new Professor(auxProf);
			professor.add(prof);
		
			System.out.println("professor: "+prof.getNome());
			
			ArrayList<Aluno> aluno = new ArrayList<Aluno>();
			String t = JOptionPane.showInputDialog("qte de alunos");
			int u = Integer.parseInt(t);
			for(int l = 0; l < u; l++) {
				prof.setAluno(aluno);
				String auxAlu = JOptionPane.showInputDialog("nome do aluno ");
				prof.getAluno().add(new Aluno(auxAlu));
				
			}
			System.out.println("alunos: ");
			for(Aluno p : aluno) {
			    System.out.println(p.getNome());
			}
			
		}
		
		
		
			
	}
}
