public class Aluno {
	private String nome;
	private ArrayList<Professor> professor;
	
	public Aluno(String nome){
		this.nome = nome;

	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(ArrayList<Professor> professor) {
		this.professor = professor;
	}
	

}
