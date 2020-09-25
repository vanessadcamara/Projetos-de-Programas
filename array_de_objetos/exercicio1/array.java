import javax.swing.JOptionPane;

public class Pessoas {
	public static void main(String[] args) {
		String nome;
		String[] pessoas = {" "," "," "," "," "," "," ", " "," "," "};
		String pergunta;
		
		for(int i = 0; i < 10; i++) {
			pergunta = JOptionPane.showInputDialog("Qual é seu nome?");// I can only use box with an string atribute
			pessoas[i] = pergunta;
			
		}for(int i1 = 0; i1 < 10; i1++) {
			System.out.println(pessoas[i1]);
		}
		int numeros = (int)Math.random()*10;
		JOptionPane.showConfirmDialog(null, "Parabéns "+ pessoas[numeros]+ ", você ganhou o sorteio!");
		
	
	}
}
