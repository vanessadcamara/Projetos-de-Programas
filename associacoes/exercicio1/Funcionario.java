public class Funcionario {
	public String nome;
	private int idade;
	public Departamento dep;
	Funcionario(String nome, int idade, Departamento dep){
		this.nome = nome;
		this.idade = idade;
		this.dep = dep;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Departamento getDep() {
		return dep;
	}
	public void setDep(Departamento dep) {
		this.dep = dep;
	}

}
