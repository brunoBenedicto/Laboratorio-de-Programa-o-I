import java.util.Scanner;

public class E2Q3 {
	/*
	 * Fa�a um programa Java que determina se o aluno passou por m�dia ou n�o. O
	 * programa dever� ler duas notas dos alunos, calcular a m�dia aritm�tica e
	 * exibir �O aluno passou por m�dia� ou �O aluno n�o passou por m�dia�.
	 */

	public static void main(String[] args) {
		double nota1, nota2;
		Scanner entrada = new Scanner(System.in);

		System.out.println("'digite a primeira nota");
		nota1 = entrada.nextDouble();
		System.out.println("digitte a segunda nota");
		nota2 = entrada.nextDouble();
		entrada.close();
		if ((nota1 + nota2) / 2 >= 7)
			System.out.println("O aluno passou por m�dia");
		else
			System.out.println("O aluno n�o passou por m�dia");

	}

}
