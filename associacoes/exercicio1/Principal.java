package departamento;
public class Principal {
	public static void main(String[] args){
		Departamento dep1 = new Departamento();
		Funcionario funcionario1 = new Funcionario("Flavia", 23,dep1);
		Funcionario funcionario2 = new Funcionario("Vanessa", 25, dep1);
		Funcionario funcionario3 = new Funcionario("José", 30, dep1);
		dep1.setNumero("1");
		dep1.setCep(11);
		dep1.setFuncionario1(funcionario1);
		dep1.setFuncionario2(funcionario2);
		dep1.setFuncionario3(funcionario3);
		Departamento dep2 = new Departamento();
		dep2.setNumero("2");
		dep2.setCep(12);
		Funcionario funcionario4 = new Funcionario("Luana", 40, dep2);
		Funcionario funcionario5 = new Funcionario("Geovana", 33, dep2);
		dep2.setFuncionario1(funcionario4);
		dep2.setFuncionario2(funcionario5);
		String a = dep1.getNumero();
		System.out.println("nome do departamento: " + a);
		String b = funcionario1.getDep().getNumero();
		System.out.println("numero do departamento que "+ funcionario1.getNome() + " trabalha: "+ b);
		int c = dep2.getFuncionario2().getIdade();
		String d = dep2.getFuncionario2().getNome();
		System.out.println("a idade de "+ d +" é "+ c);
	}
}
