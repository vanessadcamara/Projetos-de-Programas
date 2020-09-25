public class Principal {
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		pessoas[0] = new Pessoa();
		pessoas[0].setNome("Priscila");

		pessoas[1] = new Pessoa();
		pessoas[1].setNome("Vanessa");

		pessoas[2] = new Pessoa();
		pessoas[2].setNome("Bruno");

		pessoas[3] = new Pessoa();
		pessoas[3].setNome("Caio");

		pessoas[4] = new Pessoa();
		pessoas[4].setNome("Murillo");

		pessoas[5] = new Pessoa();
		pessoas[5].setNome("Rafael");

		pessoas[6] = new Pessoa();
		pessoas[6].setNome("Wesley");

		pessoas[7] = new Pessoa();
		pessoas[7].setNome("João");

		pessoas[8] = new Pessoa();
		pessoas[8].setNome("Rafaella");

		pessoas[9] = new Pessoa();
		pessoas[9].setNome("Giovana");

		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getNome().contentEquals("Vanessa")){
				System.out.println(pessoas[i].getNome()+ "Usuário encontrado");
			}else {
				System.out.println(pessoas[i].getNome() + "Não é um usuário cadastrado");
			}
		}
	}
}
