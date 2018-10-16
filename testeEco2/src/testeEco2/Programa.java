package testeEco2;

public class Programa {

	public static void main(String[] args) {
		String nome = "bruno";
		String sobrenome = "benedicto";
		char ultmaNome, ultimaSobrenome;
		ultmaNome = nome.charAt(nome.length()-1);
		ultimaSobrenome = sobrenome.charAt(sobrenome.length()-1);

		System.out.println("o seu nome fazendo eco é: " + nome+ultmaNome+ultmaNome+ " "+sobrenome+ultimaSobrenome+ultimaSobrenome+ultimaSobrenome+ultimaSobrenome);
	
	}

}
