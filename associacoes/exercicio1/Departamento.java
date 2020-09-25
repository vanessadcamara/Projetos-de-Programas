public class Departamento {
	private String numero;
	private int cep;
	public Funcionario f1;
	private Funcionario f2;
	private Funcionario f3;
	Departamento(){}
	Departamento(String numero, int cep, Funcionario f1, Funcionario f2, Funcionario f3){
		this.numero = numero;
		this.cep = cep;
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}

	public Funcionario getFuncionario1() {
		return f1;
	}
	public Funcionario getFuncionario2() {
		return f2;
	}
	public Funcionario getFuncionario3() {
		return f3;
	}
	

	public void setFuncionario1(Funcionario f1) {
			this.f1 = f1;
	}
	public void setFuncionario2(Funcionario f2) {
			this.f2 = f2;
	}
	public void setFuncionario3(Funcionario f3) {

			this.f3 = f3;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}


	
	
}
