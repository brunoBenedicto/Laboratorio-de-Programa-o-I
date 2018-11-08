package lista03_ifEncadeadosSwitch;

import java.util.Scanner;

public class E3Q5 {
	/*
	 * Calcular a média final dadas as notas das 2 provas e produzir uma saída com a
	 * média e a situação do aluno de acordo com o seguinte critério: – média >= 7,
	 * aprovado; – 3 <= média < 7, recuperação; – média < 3, reprovado. • Considerar
	 * também o número de faltas do aluno: se forem mais que 4 faltas, o aluno
	 * estará automaticamente reprovado (o usuário deve fornecer o numero de
	 * faltas). • Se o aluno se encontrar em recuperação, solicitar a nota da quarta
	 * prova e, após calcular a media final (usando a média da FBV) , informar se o
	 * aluno passou (media final >=5) ou não.
	 */
	public static void main(String[] Args) {
		double nota1, nota2, nota3, notaFinal;
		double media, mediaFinal;
		int faltas;
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite a primeira nota");
		nota1 = entrada.nextDouble();
		System.out.println("digite a segunda nota");
		nota2 = entrada.nextDouble();
		System.out.println("digite o numero de faltas");
		faltas = entrada.nextInt();

		media = (nota1 + nota2) / 2;

		if (faltas < 4) {
			if (media >= 7)
				System.out.println("Aprovado por media");
			else {
				System.out.println("digite a terceira nota");
				nota3 = entrada.nextDouble();
				if (nota3 > nota1 || nota3 > 2) {
					if (nota1 > nota2) {
						media = (nota3 + nota1) / 2;
						if (media >= 7) {
							System.out.println("Aprovado");
							return;
						}
					} else {
						media = (nota3 + nota2) / 2;
						if (media >= 7) {
							System.out.println("Aprovado");
							return;
						}
					}
				}
				if (media >= 3) {
					System.out.println("digite a nota final");
					notaFinal = entrada.nextDouble();
					mediaFinal = (media + notaFinal) / 2;
					if (mediaFinal >= 5)
						System.out.println("Aprovado");
					else
						System.out.println("Reporvado");
				}

			}
		} else
			System.out.println("Reprovado por falta");
		entrada.close();
	}
}
