import java.util.Scanner;

public class E2Q3 {
	/*
	 * Faça um programa Java que determina se o aluno passou por média ou não. O
	 * programa deverá ler duas notas dos alunos, calcular a média aritmética e
	 * exibir “O aluno passou por média” ou “O aluno não passou por média”.
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
			System.out.println("O aluno passou por média");
		else
			System.out.println("O aluno não passou por média");

	}

}
